
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from './model/Employee';
@Injectable({
  providedIn: 'root'
})
export class  HeroService{

    private url:string = "http://localhost:1234";
  constructor(private http: HttpClient) {
 
  }
  insertEmployee(employee : Employee){
    this.http.post(this.url+"/PerformInsert",employee).subscribe();
    return "Record Inserted";
  }
  updateEmployee(employee: Employee) {
    this.http.put(this.url + "/PerformUpdate" ,employee).subscribe();
    return "Record Updated";
  }
  deleteEmployee(employee: Employee) {
    this.http.delete(this.url+"/PerformDelete/"+employee.id).subscribe();
    return "Record Deleted";
  }
  getAllEmployee(){
   return this.http.get<Employee[]>(this.url+"/viewAll");
  }
}

