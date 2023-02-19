package com.salesken.service;

import java.util.List;

import com.salesken.exception.SubjectDetailsException;

public interface SubjectsDetailsInterface {


	public Double getAveragePercentageOfRecentSemester() throws SubjectDetailsException;
	
	
	
	public List<Object[]> averageMarksOfStudents() throws SubjectDetailsException;
	
	public List<Object[]> top2ConsistentStudents() throws SubjectDetailsException;
}
