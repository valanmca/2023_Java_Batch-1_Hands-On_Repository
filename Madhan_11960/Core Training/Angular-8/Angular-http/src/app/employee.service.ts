import { Injectable } from '@angular/core';
import { Employee } from './Model/Employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private url : string ="http://localhost:3004/posts";

  constructor(private http : HttpClient) { }

  insertEmployee(employee : Employee)
  {
    this.http.post(this.url, employee).subscribe();
    return "Record Inserted";

  }

  updateEmployee(employee : Employee)
  {
    this.http.put(this.url+"/"+employee.id, employee).subscribe();
    return "Record Updated";

  }

  deleteEmployee(employee : Employee)
  {
    this.http.delete(this.url+"/"+employee.id).subscribe();
    return "Record Deleted";

  }


  getAllEmployeeDetails()
  {
    return this.http.get<Employee[]>(this.url);
  }
}
