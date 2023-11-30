package com.muthu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClss {
public static void main(String[] args) {		
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		
		
		//Resoure resoures=new ClassPathResourse("beans.xml");
        //BeanFactory factory=new XmlBeanFactory(resource);  ///deferfacted line version 6 not working this Method 
       
       
		Employee bean=(Employee) context.getBean("employee");
        System.out.println(bean);
        
        
        
        
		Employee bean1=(Employee) context.getBean("employee1");
        System.out.println(bean1);		
		Address bean2=(Address) context.getBean("address");
        System.out.println(bean2);		
		
       
		Address bean3=(Address) context.getBean("address1");
        System.out.println(bean3);	
	}
}
