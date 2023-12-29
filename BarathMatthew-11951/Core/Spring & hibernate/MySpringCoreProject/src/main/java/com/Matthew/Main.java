package com.Matthew; 

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// Tightly coupled Application.
		//Employee emp = new Employee(101,"Matthew",200000);
		//emp.display();
//   Loosely coupled 
		
//		Two ways to get the object from the container ApplicationContext and resource
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
//		Resource resource = new ClassPathResource("Bean.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee bean = (Employee) context.getBean("employee");
		System.out.println(bean);
		
//		Employee bean1 = (Employee) context.getBean("employee1");
//		System.out.println(bean1);
//		
//		
//		Address add1 = (Address) context.getBean("address");
//		System.out.println(add1);
	}

}
