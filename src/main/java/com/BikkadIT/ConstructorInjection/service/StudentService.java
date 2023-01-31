package com.BikkadIT.ConstructorInjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.ConstructorInjection.dao.StudentDao;
@Service
public class StudentService {
	
	private StudentDao studentDao;
@Autowired
	public StudentService(StudentDao studentDao) {
		super();
		System.out.println("StudentService Constructor");
		this.studentDao = studentDao;
	}
	
	public void servicemethod() {
		System.out.println("Service method");
		
		studentDao.daoMethod();
	}
	
	
	
	

}
