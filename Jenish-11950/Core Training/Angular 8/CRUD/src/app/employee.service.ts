import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private url:string = "http://localhost:3004/posts";
 
  constructor(private http:HttpClient) {

  }
InsertEmployee(employee:Employee)
  {
    this.http.post(this.url,employee).subscribe();
    return "Record Inserted";
  }

UpdateEmployee(employee : Employee){
  this.http.put(this.url+"/"+employee.id, employee).subscribe();
  return "Record Updated"
}
DeleteEmployee(employee:Employee)
{
  this.http.delete(this.url+"/"+employee.id).subscribe();
  return "Record Deleted";
}
  getAllEmployeeDetails() {
    return this.http.get<Employee[]>(this.url);
  }
}
