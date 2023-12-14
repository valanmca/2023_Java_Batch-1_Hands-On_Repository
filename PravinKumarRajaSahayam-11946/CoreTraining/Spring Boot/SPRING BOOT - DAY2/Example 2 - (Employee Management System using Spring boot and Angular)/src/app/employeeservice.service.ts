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
  //private jsonurl : string = "http://localhost:3004/posts";
  private url : string = "http://localhost:1239";
 /* http: any;*/

  constructor(private http : HttpClient) { }
  insertEmployee(employee : Employee)
  {
    try{
    this.http.post(this.url+"/PerformInsert", employee).subscribe();
    return "Record Inserted" ;
    }
    catch(e)
    {
    return "Record Not Inserted" ;
    }
  }
  updateEmployee(employee : Employee)
  {
    this.http.put(this.url+"/PerformUpdate",employee) . subscribe();
    return "Record Updated";
    }
  deleteEmployee(employee : Employee)
  {
    this.http.delete(this.url+"/PerformDelete/"+employee.id).subscribe();
    return "Record Deleted";
  }
  getAllEmployeeDetails()
  {
    return this.http.get<Employee[]>(this.url+"/ViewAll");
  }
}



