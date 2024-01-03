package com.swetha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		//Tightly coupled application
		//Employee emp =new Employee(101,"Swetha",300000);
		//emp.display();
		
		
		//IOC container creates a object for employee class...in xml file
		
		
		
		//Two ways to get the object from IOC container
		// 1.Application context
		//2. Bean Factory
		
		// 1.Application context
		//ApplicationContetx - Global area for entire application.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee bean=(Employee) context.getBean("employee");
		System.out.println(bean);
		
		
		Employee bean1=(Employee) context.getBean("employee1");
		System.out.println(bean1);
		
		

		
		
		//2. Bean Factory --> It may not work for latest version
		
//		Resource resource=newClassPathResource("Beans.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
//		
//		
//		Employee bean=(Employee) factory.getBean("employee");
//		System.out.println(bean);
//		
//		
//		Employee bean1=(Employee) factory.getBean("employee1");
//		System.out.println(bean1);
		
		
		
	}

}
