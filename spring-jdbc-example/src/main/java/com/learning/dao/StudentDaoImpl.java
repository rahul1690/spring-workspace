package com.learning.dao;


import org.springframework.jdbc.core.JdbcTemplate;

import com.learning.entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student) {
		String sql = "INSERT INTO STUDENT VALUES (?,?,?)";
		
		Object[] objects = {student.getRollNo(),student.getName(),student.getAddress()};
		
		int count = jdbcTemplate.update(sql,objects);
		System.out.println("no of rows inserted "+count);
	}

}
