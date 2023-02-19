package com.salesken.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesken.DTO.StudentDto;
import com.salesken.DTO.SubjectsDetailsDto;
import com.salesken.exception.StudentException;
import com.salesken.exception.SubjectDetailsException;
import com.salesken.model.Student;
import com.salesken.service.StudentInterface;
import com.salesken.service.SubjectsDetailsInterface;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentInterface studentInterface;
	
	@Autowired
	private SubjectsDetailsInterface subjectsDetailsInterface;
	
	//add student
	@PostMapping("/save")
	public ResponseEntity<Student> addStudent(@Valid @RequestBody StudentDto student) throws StudentException{
		Student registerStudent = studentInterface.registerStudent(student) ;
		return new ResponseEntity<Student>(registerStudent,HttpStatus.CREATED) ;
	}
	
	@GetMapping("/all")
	
	public ResponseEntity<List<StudentDto>> getAllStudent() throws StudentException{
		return ResponseEntity.ok(this.studentInterface.getAllStudent());

	}
	@PutMapping("/addSubjectToStudent/{studentId}")
	public ResponseEntity<Student> addSujectToStdent(@PathVariable("studentId") Integer studentId ,@RequestBody SubjectsDetailsDto SubjectId) throws StudentException, SubjectDetailsException{
	
		Student sub = studentInterface.addSubjectToStudent(studentId,SubjectId);
		return new ResponseEntity<Student>(sub,HttpStatus.OK);
	}
	
	@GetMapping("/getAveragePercentageOfRecentSemester")
	 public ResponseEntity<Double> getAverageOfRecentSemester() throws SubjectDetailsException{
		 return new ResponseEntity<Double>(subjectsDetailsInterface.getAveragePercentageOfRecentSemester(),HttpStatus.OK);
	 }
	
	@GetMapping("/averageMarksOfStudents")
	 public ResponseEntity<List<Object[]>> getaverageMarksOfStudents() throws SubjectDetailsException{
		return new ResponseEntity<List<Object[]>>(subjectsDetailsInterface.averageMarksOfStudents(),HttpStatus.OK);
	 }
	@GetMapping("/top2ConsistentStudents")
	 public ResponseEntity<List<Object[]>> gettop2ConsistentStudents() throws SubjectDetailsException{
		return new ResponseEntity<List<Object[]>>(subjectsDetailsInterface.top2ConsistentStudents(),HttpStatus.OK);
	 }
}
