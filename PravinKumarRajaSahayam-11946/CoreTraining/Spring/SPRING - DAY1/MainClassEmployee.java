package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClassEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tightly Coupled Application
//Employee emp = new Employee(101,"PravinKumar",10000);
//emp.display();

//Loosely Coupled Application
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee bean = (Employee) context.getBean("employee");
		//bean.display();
		System.out.println(bean);
		
		Address bean2 = (Address) context.getBean("address");
		//bean2.display1();
		System.out.println(bean2);
		
		Employee bean1 = (Employee) context.getBean("employee1");
		//bean1.display();
		System.out.println(bean1);
		
		Address bean3 = (Address) context.getBean("address1");
		//bean3.display1();
		System.out.println(bean3);
		
		//Employee bean6 = (Employee) context.getBean("InjectWithSetter");
		//System.out.println(bean6);
	}

}