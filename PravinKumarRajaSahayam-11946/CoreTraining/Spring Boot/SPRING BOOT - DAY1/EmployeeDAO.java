package com.ems.dao;
import java.util.List;
import org.hibernate.query.Query;
import org.springframework.data.repository.CrudRepository;
import com.ems.bean.Employee;
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

}
