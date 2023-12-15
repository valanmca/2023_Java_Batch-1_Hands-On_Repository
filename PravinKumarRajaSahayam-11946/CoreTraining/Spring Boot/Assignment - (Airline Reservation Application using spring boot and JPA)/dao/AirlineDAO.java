package com.dsrc.airline.dao;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.dsrc.airline.bean.Airline;
public interface AirlineDAO extends CrudRepository<Airline, Integer> {
Airline findByflightno(String flightno);
/*Airline findByDepartment(String department);
void deleteByName(String name);
@Query("SELECT * from Airline where department = ECE")
List<Airline> getAllEmployeeByUsingDepartment();*/
}
