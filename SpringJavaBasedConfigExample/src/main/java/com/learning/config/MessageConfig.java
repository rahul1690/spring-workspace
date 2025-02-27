package com.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.model.Message;

@Configuration
public class MessageConfig {
	
	@Bean(name = "message")
	public Message getMessage() {
		Message m1 = new Message();
//		m1.setMessageId(1);
//		m1.setMessage("Message from Rahul"); These values can be passed with help of @Value annotation
		return m1;
	}
}
