package com.example.HandlingLists.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.HandlingLists.domain.Student;



@Controller
public class HandlingListController {

	@RequestMapping("/hello")
	public String listStudent( Model model) {
	
		ArrayList<Student> studentList = new ArrayList<Student>(); 
		
		Student student1 = new Student("Kate", "Cole"); 
		Student student2 = new Student("Dan", "Brown"); 
		Student student3 = new Student("Mike", "Mars");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		model.addAttribute("students", studentList);
		
		return "hello";
	}
}
