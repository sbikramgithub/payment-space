package com.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.entitiy.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
