package com.learning.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.config.MessageConfig;
import com.learning.model.Message;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		
		try {
			context = new AnnotationConfigApplicationContext(MessageConfig.class);
//			context.register(null); for registering more classes and can also pass basePackages string in constructor
			
			Message message = context.getBean("message", Message.class);
			System.out.println(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(context!=null) context.close();
		}
	}

}
