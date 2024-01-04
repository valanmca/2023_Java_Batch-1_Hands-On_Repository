package com.jeyandhan.day01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		// Tightly Coupled Application
//		Employee emp = new Employee(11,"Jeyandhan",10000);
//		emp.display();

		// loosely coupled
		
		//Application contextb
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee bean = (Employee) context.getBean("employee");
		System.out.println(bean);
//
//		Employee bean1 = (Employee) context.getBean("employee1");
//		System.out.println(bean1);
		
//		Address bean2 = (Address) context.getBean("address");
//		System.out.println(bean2);

//		Address bean3 = (Address) context.getBean("address1");
//		System.out.println(bean3);
		
		//Bean Factory
		
//		Resource resource = new ClassPathResource("Beans.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		Employee bean = (Employee) factory.getBean("employee");
//		System.out.println(bean);
//
//		Employee bean1 = (Employee) factory.getBean("employee1");
//		System.out.println(bean1);
	}
}
