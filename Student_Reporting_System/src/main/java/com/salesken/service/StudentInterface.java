package com.salesken.service;

import java.util.List;

import com.salesken.DTO.StudentDto;
import com.salesken.DTO.SubjectsDetailsDto;
import com.salesken.exception.StudentException;
import com.salesken.exception.SubjectDetailsException;
import com.salesken.model.Student;

public interface StudentInterface {

	
	Student registerStudent(StudentDto studentDto)throws StudentException;
	List<StudentDto> getAllStudent()throws StudentException;
	StudentDto findStudentById(Integer studentId)throws StudentException;
	public Student addSubjectToStudent(Integer studentId,SubjectsDetailsDto subject) throws SubjectDetailsException,StudentException;
}
