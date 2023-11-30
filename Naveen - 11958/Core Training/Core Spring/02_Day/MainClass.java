package com.naveen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		// Tightly Coupled Application
		// Employee emp = new Employee(101, "Valan", 2000);
		// emp.display();

		// Reading data from the Ioc Container.
		// ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource); //Deprecated type

		Employee bean = (Employee) factory.getBean("employee"); // Injection.
		System.out.println(bean);

		Employee bean1 = (Employee) factory.getBean("employee1");
		System.out.println(bean1);
		
		
//		Employee bean = (Employee) context.getBean("employee"); // Injection.
//		System.out.println(bean);
//
//		Employee bean1 = (Employee) context.getBean("employee1");
//		System.out.println(bean1);

//		Address addr = (Address) context.getBean("address");
//		System.out.println(addr);
//
//		Address addr1 = (Address) context.getBean("address1");
//		System.out.println(addr1);

	}

}
