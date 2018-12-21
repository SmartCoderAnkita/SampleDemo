package version1.com.demo;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import version1.com.demo.Student;

@Controller
public class AdmissionController {

	@ModelAttribute
	public void addCommenAttribute(Model model) {
		model.addAttribute("headerName", "Sanjuba Ajuba School");
		model.addAttribute("formName", "STUDENT APPLICATON FORM");
		model.addAttribute("project", "/SpringProg/");
	}
	
	@RequestMapping(value = "/admission_form", method = RequestMethod.GET)
	public ModelAndView admission_form() {
		return new ModelAndView("AdmissionForm");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"StudentMobileNo"});
//		SimpleDateFormat format = new SimpleDateFormat("yyyy*MM**dd");
//		binder.registerCustomEditor(Date.class, "StudentDOB",new CustomDateEditor(format, false));
		binder.registerCustomEditor(String.class, "StudentName", new StudentNameEditor());
	}

	@RequestMapping(value = "/admission_success", method = RequestMethod.POST)
	public ModelAndView saveForm(@ModelAttribute("student") Student stu,BindingResult bind) {
		if(bind.hasErrors()) {
			return new ModelAndView("AdmissionForm");
		}
		System.out.println(stu.toString());
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;
	}

}
