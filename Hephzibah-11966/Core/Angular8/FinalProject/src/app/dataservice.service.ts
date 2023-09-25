import { Injectable } from '@angular/core';
import { details } from './model/details';
import {HttpClient} from '@angular/common/http';




@Injectable({
  providedIn: 'root'
})
export class DataService {
  private url:string="http://localhost:3004/posts";




  constructor(private http:HttpClient) { }
  insert(patient:details)
  {
    this.http.post(this.url,patient).subscribe();
    return "Record Inserted"
  }
  update(patient:details)
  {
    this.http.put(this.url+"/"+patient.id,patient).subscribe();
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




  // getAllDetail(){
  //   return this.http.get<Student[]>(this.url);




  // }
}


