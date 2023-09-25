import { Injectable } from '@angular/core';
import { Teacher } from './Model/teacher';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TeacherserviceService{


  private url: string="http://localhost:3004/posts";

  constructor(private http:HttpClient) { }

  insertdetails(tcr : Teacher){
    this.http.post(this.url,tcr).subscribe();
    return "Record Inserted";
  }

  getAllDetails(){
    return this.http.get<Teacher[]>(this.url);
  }

  updatedetails(tcr:Teacher){
    this.http.put(this.url+"/"+tcr.id,tcr).subscribe();
    return "Record Updated";
  }

  deletedetails(tcr:Teacher){
    this.http.delete(this.url+"/"+tcr.id).subscribe();
    return "Record Deleted";
  }




  

}
