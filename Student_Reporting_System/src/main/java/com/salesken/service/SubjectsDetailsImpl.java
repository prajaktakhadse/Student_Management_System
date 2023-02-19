package com.salesken.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salesken.exception.SubjectDetailsException;
import com.salesken.repository.SubjectDetailsRepo;

public class SubjectsDetailsImpl implements SubjectsDetailsInterface {

	@Autowired
	private SubjectDetailsRepo subjectDetailsRepo;
	
	 
	
	
	@Override
	public Double getAveragePercentageOfRecentSemester() throws SubjectDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> averageMarksOfStudents() throws SubjectDetailsException {
		// TODO Auto-generated method stub
		return subjectDetailsRepo.averageMarksOfStudents();
	}

	@Override
	public List<Object[]> top2ConsistentStudents() throws SubjectDetailsException {
		// TODO Auto-generated method stub
		return subjectDetailsRepo.averageMarksOfStudents();
	}

}
