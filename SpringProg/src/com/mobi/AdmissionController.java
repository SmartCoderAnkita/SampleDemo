package com.mobi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mobi.Student;

@Controller
public class AdmissionController {

	@ModelAttribute
	public void addCommenAttribute(Model model) {
		model.addAttribute("headerName", "Sanjuba Ajuba School");
		model.addAttribute("formName", "STUDENT APPLICATON FORM");
		model.addAttribute("project", "/SpringProg/");
	}

	@RequestMapping(value = "/admission_success", method = RequestMethod.POST)
	public ModelAndView saveForm(@ModelAttribute("student") Student stu) {
		System.out.println(stu.toString());
		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("students", stu);
//		model.addAttribute("student", stu);
		return model;
	}

	@RequestMapping(value = "/admission_form", method = RequestMethod.GET)
	public ModelAndView admission_form() {
		return new ModelAndView("AdmissionForm");
	}
}
