import { Injectable } from '@angular/core';
import{Employee}from 'Model/Employee';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {
  //private url: string="http://localhost:3004/posts";
  private url: string="http://localhost:9876";

  insertEmployee(employee:Employee){
    this.http.post(this.url+"/PerformInsert",employee).subscribe();
    return "Record Inserted";
  }


 deleteEmployee(employee:Employee){
  this.http.delete(this.url+"/PerformDelete/"+ employee.id).subscribe();
  return "Record deleted";
 }


 updateEmployee(employee:Employee){
  this.http.put(this.url+"/PerformUpdate",employee).subscribe();
  return "Record updated";
 }
 
  getAllEmployeeDetails(){
    return this.http.get<Employee[]>(this.url+"/ViewAll");
  }

  constructor(private http : HttpClient) {  }
}
