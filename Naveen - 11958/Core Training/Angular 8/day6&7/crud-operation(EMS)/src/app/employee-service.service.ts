import { Injectable } from '@angular/core';
import { Employee } from './modal/Employee';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {
  private url : string = "http://localhost:3004/posts";

  constructor(private http : HttpClient) { }

  InsertEmployee(employee : Employee){
    this.http.post(this.url, employee).subscribe();
    return "Record Inserted";
  }
  updateEmployee(employee : Employee){
    // alert(this.getEmployeeDetails(employee.id));
    if(this.getEmployeeDetails(employee.id) != null){
    this.http.put(this.url+"/"+employee.id, employee).subscribe();
    return "Record Updated";
    }
    else{
      return "Record Not Found";
    }
  }
  deleteEmployee(employee : Employee){
    this.http.delete(this.url+"/"+employee.id).subscribe();
    return "Record Deleted"
  }
  getAllEmployeeDetails(){
    return this.http.get<Employee[]>(this.url);
  }

  getEmployeeDetails(id : number){
    
    this.http.get<Employee[]>(this.url+"/"+id);
    
    
  }
}
