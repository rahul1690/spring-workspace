package com.learning.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.dao.StudentDao;
import com.learning.entity.Student;

public class Client {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		Student student = new Student();
		student.setRollNo(1002);
		student.setName("Pranav");
		student.setAddress("Bangalore");
		
		studentDao.insert(student);
		context.close();
	}
}
