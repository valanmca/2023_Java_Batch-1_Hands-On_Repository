import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from './model/student';

@Injectable({
  providedIn: 'root'
})
export class StudentInfoService {

  private url : string="http://localhost:3102/posts";

  constructor(private http : HttpClient) { }

  insertStudent(student : Student)
  {
    this.http.post(this.url, student).subscribe();
    return "Record Inserted";
  }

  updateStudent(student : Student)
  {
    this.http.put(this.url+"/"+student.id, student).subscribe();
    return "Record Updated";
  }

  deleteStudent(student : Student)
  {
    this.http.delete(this.url+"/"+student.id ).subscribe();
    return "Record deleted";
  }

  getAllStudentDetails()
  {
    return this.http.get<Student[]>(this.url);
  }
}
