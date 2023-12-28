import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  getEmployeeList() {
    throw new Error('Method not implemented.');
  }

  constructor(private http: HttpClient) { }

  addEmployee(data: any):Observable<any> {
    return this.http.post('http://localhost:3000/employee', data);
  }

  getEmployee():Observable<any> {
    return this.http.get('http://localhost:3000/employee');
  }
}
