import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private url : string = "http://localhost:3004/posts";
 
  constructor(private http : HttpClient) { }
  insertEmployee(employee:Employee){
    this.http.post(this.url,employee).subscribe();
    return "Record Inserted Successfully.";
  }
  updateEmployee(employee:Employee){ //based on id we change details
    this.http.put(this.url + "/" +employee.id,employee).subscribe();
    return "Record Updated Successfully.";
  }
deleteEmployee(employee:Employee){
  this.http.delete(this.url + "/"+employee.id).subscribe();
  return "Record Deleted Successfully";
}
getAllEmployeeDetails(){
  return this.http.get<Employee[]>(this.url);
}

}
