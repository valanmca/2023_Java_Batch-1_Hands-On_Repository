package com.pams.dao;

import org.springframework.data.repository.CrudRepository;

import com.pams.bean.Patient;

public interface PatientDAO  extends CrudRepository<Patient, Integer>{

}
