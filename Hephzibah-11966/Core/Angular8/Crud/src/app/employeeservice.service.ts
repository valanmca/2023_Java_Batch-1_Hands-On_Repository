import { Injectable } from '@angular/core';
import { Employee } from 'Model/Employee';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {
  private url: string="http://localhost:3004/posts";

  insertEmployee(employee:Employee){
    this.http.post(this.url, employee).subscribe();
    return "Record Inserted";
  }
  deleteEmployee(employee:Employee){
    this.http.delete(this.url+"/"+ employee.id).subscribe();
    return "Record Deleted";
  }
  updateEmployee(employee:Employee){
    this.http.put(this.url+"/"+ employee.id,employee).subscribe();
    return "Record Updated";
  }
  getAllEmployeeDetails(){
    return this.http.get<Employee[]>(this.url);
  }
  constructor(private http:HttpClient) { }
}
