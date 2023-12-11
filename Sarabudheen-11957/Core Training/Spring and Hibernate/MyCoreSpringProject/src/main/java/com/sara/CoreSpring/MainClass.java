package com.sara.CoreSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {

		// Tightly Coupled Application
		// Employee emp = new Employee(101, "Sara", 14000);
		// emp.display();

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//		Resource resource = ClassPathResource("Beans.xml");
//		BeanFactory factory = XmlBeanFactory(resource);

		Employee bean1 = (Employee) context.getBean("employee1");
		System.out.println(bean1);

		System.out.println("===========================================");

		Employee bean2 = (Employee) context.getBean("employee2");
		System.out.println(bean2);

		System.out.println("===========================================");

	}

}
