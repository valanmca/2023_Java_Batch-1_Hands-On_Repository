import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {student} from './model/student';

@Injectable({
  providedIn: 'root'
})
export class StudentserviceService {
  private url: string ="http://localhost:3004/posts";

  constructor(private http : HttpClient) { }

  insertStudent(stud: student){
    this.http.post(this.url,student).subscribe();
    return "Record Inserted"  
  }
  updateStudent(stud:student){
    this.http.put(this.url+"/"+ stud.srno,student).subscribe();
    return "Record updated";
  }
  deleteStudent(stud:student){
    this.http.delete(this.url+"/"+ stud.srno).subscribe();
    return "Record Deleted";
  }
  getAllStudentDetails(){
    return this.http.get<student>(this.url);
  }

}
