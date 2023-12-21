import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Student } from './Model/Student';


@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private url : string="http://localhost:1107";

  constructor(private http : HttpClient) { }

  insertStudent(student : Student)
  {
    this.http.post(this.url+"/PerformInsert", student).subscribe();
    return "Record Inserted";

  }

  updateStudent(student : Student)
  {
    this.http.put(this.url+"/PerformUpdate", student).subscribe();
    return "Record Updated";

  }

  deleteStudent(student : Student)
  {
    this.http.delete(this.url+"/PerformDelete/"+student.id).subscribe();
    return "Record Deleted";

  }


  getAllStudentDetails()
  {
    return this.http.get<Student[]>(this.url+"/ViewAll");
  }

  
}
