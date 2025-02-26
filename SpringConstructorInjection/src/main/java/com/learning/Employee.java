package com.learning;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int id;
	private String name;
	private Address address;
	public int getId() {
		return id;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(Address address) {
		super();
		this.address = address;
	}



	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
