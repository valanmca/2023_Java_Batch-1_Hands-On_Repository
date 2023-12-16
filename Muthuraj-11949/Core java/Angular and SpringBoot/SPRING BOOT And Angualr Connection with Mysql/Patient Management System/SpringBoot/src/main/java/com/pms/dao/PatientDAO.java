package com.pms.dao;
import org.springframework.data.repository.CrudRepository;

import com.pms.bean.Patient;

public interface PatientDAO extends CrudRepository<Patient, Integer> {
}