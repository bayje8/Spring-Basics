package com.example.demo.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);

		SortingAlgorithm bean = context.getBean(SortingAlgorithm.class);
		System.out.println(bean);

	}

}
