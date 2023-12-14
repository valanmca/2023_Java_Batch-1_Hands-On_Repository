package com.ems.dao;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ems.bean.Employee;
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {
Employee findByName(String name);
/*Employee findByDepartment(String department);
void deleteByName(String name);
@Query("SELECT * from Employee where department = ECE")
List<Employee> getAllEmployeeByUsingDepartment();*/
}
