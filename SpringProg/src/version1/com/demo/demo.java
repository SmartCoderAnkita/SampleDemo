package version1.com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class ByStringContentComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
//		return a.length() - b.length();
		String StudentName1 = s1.toUpperCase();
		String StudentName2 = s2.toUpperCase();

		// ascending order
		return StudentName1.compareTo(StudentName2);
	}

}

class ByStringContentComparable implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class demo {

	public static void main(String[] args) {
		//anagram
		String s = "JAVA";
		String p = "vaja";
		char[] a = s.toCharArray();
		char[] c = p.toCharArray();
		Arrays.sort(a);
		Arrays.sort(c);
		String ss = new String(a);
		String bb = new String(c);
		System.out.println(ss.equalsIgnoreCase(bb)+"\n\n\n");
		
		//list sort ways
		
		List<String> list = new LinkedList<>();
		list.add("Ankita");
		list.add("Shyam");
		list.add("Ashish");
		list.add("Palkar");
		list.add("Vishal");

		Collections.sort(list, new ByStringContentComparator());

		// lambda expression in forEach Method
		list.forEach(str -> System.out.println(str));

	}

}
