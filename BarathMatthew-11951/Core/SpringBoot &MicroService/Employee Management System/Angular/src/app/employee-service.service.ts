import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Employee } from './model/Employee';


@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {
  

  private url : string = "http://localhost:1234";
  constructor(private http : HttpClient) { }


    insertEmployee(employee : Employee){
      this.http.post(this.url+"/PerformInsert",employee).subscribe();
      return "Record Inserted";
    }


    // deleteEmployee(employee:Employee){
    //   this.delete(this.url+"/"+Employee.id).subscribe();
    //   return "record Deleted"
    // }


    getAllEmployeeDetails(){
      return this.http.get<Employee[]>(this.url+"/ViewAll");
    }

    updateEmployee(employee : Employee){
      this.http.put(this.url+"/PerformUpdate",employee).subscribe();
      return "Record updated";
    }

    deleteEmployee(employee:Employee){
      this.http.delete(this.url+"/PerformDelete/"+employee.eId).subscribe();
      return "Record Deleted";
    }

    
}
