package com.BikkadIT.ConstructorInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.ConstructorInjection.service.StudentService;
@Controller
public class StudentController {
	
	private StudentService studentService;
@Autowired
	public StudentController(StudentService studentService) {
		super();
		System.out.println("StudentController constructor");
		this.studentService = studentService;
	}
	public void controllermethod() {
		System.out.println("controller method");
		
		studentService.servicemethod();
	}
	
	
	
	

}
