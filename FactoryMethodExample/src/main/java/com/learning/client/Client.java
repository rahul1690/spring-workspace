package com.learning.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.model.ATM;

public class Client {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		ATM atm = context.getBean("atm",ATM.class);
		
		atm.printAccountBalance("1234");
		
		context.close();
	}

}
