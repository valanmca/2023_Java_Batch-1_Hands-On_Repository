import { Injectable } from '@angular/core';
import { Student } from './model/Student';
import {HttpClient} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class DataService {
  private url:string="http://localhost:3004/posts";


  constructor(private http:HttpClient) { }
  insert(student:Student)
  {
    this.http.post(this.url,student).subscribe();
    return "Record Inserted"
  }
  update(student:Student)
  {
    this.http.put(this.url+"/"+student.id,student).subscribe();
    return "Record updated"
  }


  delete(student:Student)
  {
    this.http.delete(this.url+"/"+student.id).subscribe();
    return "Record Deleted"
  }
  getAlldetails()
  {
    return this.http.get<Student[]>(this.url);
  }


  // getAllDetail(){
  //   return this.http.get<Student[]>(this.url);


  // }
}


