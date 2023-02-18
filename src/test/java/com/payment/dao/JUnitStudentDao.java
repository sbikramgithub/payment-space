package com.payment.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.payment.entitiy.Student;
import com.payment.repository.StudentRepository;

@SpringBootTest
public class JUnitStudentDao {
	@Autowired
	StudentRepository repository;
	
	Student student;
	
	@BeforeEach
	public void insertStudent() {
		student=new Student();
		student.setAdress("chhend colony");
		student.setStudentName("Bikram Sahoo");
		student.setAge(24);
		student.setStudentNo(1001);
		student.setMobileNo("7008358109");
		System.out.println(repository.save(student));
		
	}
	@Test
	public void testStudent() {
		List<Student> studednts=repository.findAll();
		Student dbStudent=studednts.get(0);
		assertEquals(student.getAdress(), dbStudent.getAdress());
		assertEquals(student.getAge(), dbStudent.getAge());
		assertEquals(student.getStudentName(), dbStudent.getStudentName());
	}
	@AfterEach
	public void deleteStudent() {
		List<Student> studednts=repository.findAll();
		repository.deleteAll(studednts);
		System.out.println("deleted");
	}
}
