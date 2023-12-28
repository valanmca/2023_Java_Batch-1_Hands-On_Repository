package com.jeban;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
//		//Tightly Coupled Application
//		Employee emp=new Employee(101,"Ignesh",2000);
//		emp.display();

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");// Reading data from the xml file.
		Employee bean = (Employee) context.getBean("employee");
		bean.show();
//		System.out.println(bean);

		
		
		Employee bean1=(Employee) context.getBean("employee1");
		System.out.println(bean1);//Constructor Dependency
		

		/*****Bean Factory*****/
		
//		Resource resource=new ClassPathResource("bean.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);//[works below version 5]
//		
//		Employee bean=(Employee) factory.getBean("employee");
//		System.out.println(bean);
		


	}

}
