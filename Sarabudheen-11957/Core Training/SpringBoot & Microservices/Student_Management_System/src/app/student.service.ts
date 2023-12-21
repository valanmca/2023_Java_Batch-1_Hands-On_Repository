import { Injectable } from '@angular/core';
import { Student } from './Model/Student';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private url : string="http://localhost:9797";

  constructor(private http : HttpClient) { }

InsertStudent(student : Student){
  this.http.post(this.url+"/PerformInsert",student).subscribe();
  return "Record Inserted";
}

UpdateStudent(student : Student){
  this.http.put(this.url+"/PerformUpdate",student).subscribe();
  return "Record Updated";
}

DeleteStudent(student : Student){
  this.http.delete(this.url+"/PerformDelete/"+student.id).subscribe();
  return "Record Deleted";
}

getAllStudentDetails(){
  return this.http.get<Student[]>(this.url+"/ViewAll");
}
}
