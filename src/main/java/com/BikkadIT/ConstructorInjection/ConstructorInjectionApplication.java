package com.BikkadIT.ConstructorInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.ConstructorInjection.controller.StudentController;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ConstructorInjectionApplication.class, args);
		
		StudentController studentController = run.getBean(StudentController.class);
		studentController.controllermethod();
	}

}
