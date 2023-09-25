import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {details} from './Model/details';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private url:string="http://localhost:3004/posts";


  constructor(private http:HttpClient) { }
  insert(student:details)
  {
    this.http.post(this.url,student).subscribe();
    return "Record Inserted"
  }
  update(student:details)
  {
    this.http.put(this.url+"/"+student.id,student).subscribe();
    return "Record updated"
  }


  delete(student:details)
  {
    this.http.delete(this.url+"/"+student.id).subscribe();
    return "Record Deleted"
  }
  getAlldetails()
  {
    return this.http.get<details[]>(this.url);
  }
}
