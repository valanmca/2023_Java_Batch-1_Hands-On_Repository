package com.dharshu;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//Tightly coupled application
        //Employee emp = new Employee(101, "Jenish", 1000);
        //emp.display();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //Resource resource = new ClassPathResource("Beans.xml");
        //BeanFactory factory = new XmlBeanFactory(resource);
        Employee bean = (Employee) context.getBean("employee");
        //bean.display();
        System.out.println(bean);
        
        Address bean2 = (Address)context.getBean("address");
//        //bean2.display();
        System.out.println(bean2);
        
        Employee bean1 = (Employee) context.getBean("employee1");
//        //bean1.display();
        System.out.println(bean1);
        
        Address bean3 = (Address)context.getBean("address1");
//        //bean3.display();
        System.out.println(bean3);

		
	}

}
