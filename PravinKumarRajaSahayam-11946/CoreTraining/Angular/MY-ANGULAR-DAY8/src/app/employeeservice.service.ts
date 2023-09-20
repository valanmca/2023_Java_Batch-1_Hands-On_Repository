import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import { Employee } from './model/Employee';
/*import { Employee } from './Employee';*/
/*import { Employee } from './modal/Employee';*/
/*import {HttpClient } from '@angular/common/http';*/

@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {
  private url : string = "http://localhost:3004/posts";
 /* http: any;*/

  constructor(private http : HttpClient) { }
  insertEmployee(employee : Employee)
  {
    this.http.post(this.url, employee).subscribe();
    return "Record Inserted" ;
  }
  updateEmployee(employee : Employee)
  {
    this.http.put(this.url+"/"+employee.id,employee) . subscribe();
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



