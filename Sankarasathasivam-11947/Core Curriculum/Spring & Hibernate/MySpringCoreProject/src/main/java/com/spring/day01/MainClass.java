package com.spring.day01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {

		// Tightly Coupled Application

//		Employee emp = new Employee(11947, "Shiva", 2000);
//		emp.display();

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//		Resource resource = new ClassPathResource("Beans.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);

		Employee bean = (Employee) context.getBean("employee");
		System.out.println(bean);
		System.out.println("");
		
		// Setting the Salary manually
		bean.setSalary(10000);
		System.out.println(bean);
		System.out.println("");

//		Address bean1 = (Address) context.getBean("address");
//		System.out.println(bean1);

		// Using Constructor

		Employee bean2 = (Employee) context.getBean("employee1");
		System.out.println(bean2);

//		Address bean3 = (Address) context.getBean("address1");
//		bean3.display();
//		System.out.println(bean3);
	}

}
