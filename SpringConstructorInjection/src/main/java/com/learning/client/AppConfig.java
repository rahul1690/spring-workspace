package com.learning.client;

import org.springframework.context.annotation.Bean;

import com.learning.Address;
import com.learning.Employee;

public class AppConfig {
	
	@Bean(name = "address")
	public Address address() {
		Address address = new Address();
		address.setCity("Belgaum");
		address.setState("KA");
		address.setCountry("IND");
		return address;
	}

	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		return emp;
	}
}
