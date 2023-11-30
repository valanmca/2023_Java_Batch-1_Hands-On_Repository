package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		// Tightly Coupled Application
		// Employee emp = new Employee(101, "Valan", 2000);
		// emp.display();

		// Reading data from the Ioc Container.
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		Employee bean = (Employee) context.getBean("employee"); // Injection.
		System.out.println(bean);

		Employee bean1 = (Employee) context.getBean("employee1");
		System.out.println(bean1);

//		Address addr = (Address) context.getBean("address");
//		System.out.println(addr);

//		Address addr1 = (Address) context.getBean("address1");
//		System.out.println(addr1);

	}

}
