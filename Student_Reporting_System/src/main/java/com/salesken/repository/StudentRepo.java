package com.salesken.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesken.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
