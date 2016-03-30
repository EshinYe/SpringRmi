package com.eshin.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMain {

	public static void main(String[] args) {
		 System.out.println("服务启动中……");  
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-*.xml");  
	        context.getBean("helloService");  
	        System.out.println("服务启动完成"); 
	}

}
