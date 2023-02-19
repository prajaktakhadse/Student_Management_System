package com.salesken.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salesken.model.SubjectsDetails;

@Repository
public interface SubjectDetailsRepo extends JpaRepository<SubjectsDetails, Integer> {

	@Query(value="SELECT AVG(marks) as Average from subjectsDetails group by semester order by semester desc limit 1") 
	public List<Object[]> getAveragePercentageOfRecentSemester() ;
	
	@Query(value="SELECT student.name as name, AVG(marks) as avg_marks,case subjects when 0 then 'English' when 1 then 'Maths' when 2 then 'science' else 'unknown' end as subname from subjects left join student_subject on subject_subject_id = subjectsDetails.subject_id LEFT JOIN student ON student_subject.student_student_id = student.student_id group by name,subjects" ,nativeQuery=true) 
	public List<Object[]> averageMarksOfStudents() ;
	
	
	@Query(value="SELECT student.name, AVG(marks) as avg_marks from subjects left join student_subject on subject_subject_id = subjectsDetails.subject_id LEFT JOIN student ON student_subject.student_student_id = student.student_id group by student.name order by avg_marks desc limit 2;" ,nativeQuery=true) 
	public List<Object[]> top2ConsistentStudents() ;
}
