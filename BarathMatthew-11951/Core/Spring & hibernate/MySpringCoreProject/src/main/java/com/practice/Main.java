package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("PracticeBean.xml");
		Book bean =(Book) context.getBean("book");
		System.out.println(bean);
	}
}
