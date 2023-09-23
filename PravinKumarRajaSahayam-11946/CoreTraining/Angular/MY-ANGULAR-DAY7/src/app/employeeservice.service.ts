import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import { Employee } from './model/Employee';
/*import { Employee } from './Employee';*/

@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {
  private url : string = "http://localhost:3004/posts";
  http: any;

  constructor() { }
  insertEmployee(employee : Employee)
  {
    this.http.post(this.url, employee).subscribe();
    return "Record Inserted" ;
  }
}



