package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClassBook {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	Book book1 = (Book) context.getBean("book1");
	System.out.println(book1);
	Book book2 = (Book) context.getBean("book2");
	System.out.println(book2);
	Book book3 = (Book) context.getBean("book3");
	System.out.println(book3);
	}

}
