import { Injectable } from '@angular/core';
import { Student } from './model/student';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentserviceService {
  private url:string = "http://localhost:3004/posts"
  
  constructor(private http: HttpClient) { 
  
  }
  insertDetails(student:Student) {
    this.http.post(this.url, student).subscribe();
    return "Record Inserted";
  }
  updateDetails(student: Student) {
    this.http.put(this.url + "/" + student.id, student).subscribe();
    return "Record Updated";
  }
  deleteDetails(student: Student) {
    this.http.delete(this.url + "/" + student.id).subscribe();
    return "Record Deleted";
  }
  getAllDetails(){
    return this.http.get<Student[]>(this.url)
   }
}
