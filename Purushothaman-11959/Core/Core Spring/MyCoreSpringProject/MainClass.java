package com.day1;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;




public class MainClass {

	public static void main(String[] args) {
		//Tightly Coupled Application
		//Employee employee=new Employee(101,"Kumar",2000);
		//employee.display();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
//		Resource resource =new ClassPathResource("Beans.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee bean=(Employee) context.getBean("employee");
		System.out.println(bean);
		
//		Employee bean2=(Employee) context.getBean("employee1");
//		System.out.println(bean2);
//		
		Employee bean3=(Employee) context.getBean("employee2");
		System.out.println(bean3);
		
	}

}
