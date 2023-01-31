package com.BikkadIT.ConstructorInjection.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	public void daoMethod() {
		System.out.println("Dao Method");
	}

	public StudentDao() {
		super();
		System.out.println("Student dao constructor");
	}
	

}
