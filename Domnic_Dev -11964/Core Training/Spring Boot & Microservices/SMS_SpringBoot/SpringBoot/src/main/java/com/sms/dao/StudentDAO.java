package com.sms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sms.bean.Student;

public interface StudentDAO extends CrudRepository<Student, Integer> {

	Student findBySName(String std_name);

	Student findBySsec(String std_sec);

	void deleteBySName(String std_name);

	@Query("SELECT * FROM tbl_student where std_sec='B-sec'")
	List<Student> getAllStudentBySection();
}
