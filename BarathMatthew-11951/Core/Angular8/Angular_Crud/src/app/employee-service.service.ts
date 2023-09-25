import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Employee } from './model/Employee';


@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {
  

  private url : string = "http://localhost:3004/posts";
  constructor(private http : HttpClient) { }


    insertEmployee(employee : Employee){
      this.http.post(this.url,employee).subscribe();
      return "Record Inserted";
    }


    // deleteEmployee(employee:Employee){
    //   this.delete(this.url+"/"+Employee.id).subscribe();
    //   return "record Deleted"
    // }


    getAllEmployeeDetails(){
      return this.http.get<Employee[]>(this.url);
    }

    updateEmployee(employee : Employee){
      this.http.put(this.url+"/"+employee.id,employee).subscribe();
      return "Record updated";
    }

    deleteEmployee(employee:Employee){
      this.http.delete(this.url+"/"+employee.id).subscribe();
      return "Record Deleted";
    }

    

    
}
