package com.tms.dao;

import org.springframework.data.repository.CrudRepository;

import com.tms.bean.Teacher;

public interface TeacherDAO extends CrudRepository<Teacher, Integer> {

}
