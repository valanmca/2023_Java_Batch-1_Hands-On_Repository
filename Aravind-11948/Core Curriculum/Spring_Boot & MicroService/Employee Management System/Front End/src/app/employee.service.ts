import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Employee } from './model/Employee';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  // private url :string="http://localhost:3004/posts"
  private url:string="http://localhost:4242";

  constructor( private http :HttpClient) { }
  InsertEmployee(employee:Employee){
    this.http.post(this.url+"/PerformInsert",employee).subscribe();
    return "Record Inserted";
  }

  updateDetail(employee:Employee)
  {
    this.http.put(this.url+"/PerformUpdate",employee).subscribe();
    return "Record updated";


  }

  deleteDetail(employee:Employee)
  {
    this.http.delete(this.url+"/PerformDelete/"+employee.id).subscribe()
    return "Record Deleted"
  }


  

  getAlldetails()
  {
    return this.http.get<Employee[]>(this.url+"/ViewAll");
  }


}
