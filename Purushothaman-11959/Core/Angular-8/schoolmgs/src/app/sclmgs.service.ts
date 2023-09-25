import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { School } from './model/School';

@Injectable({
  providedIn: 'root'
})
export class SclmgsService {

  private url: string="http://localhost:3004/posts";

  constructor(private http:HttpClient) { }

  insertdetails(scl : School){
    this.http.post(this.url,scl).subscribe();
    return "Record Inserted";
  }

  getAllDetails(){
    return this.http.get<School[]>(this.url);
  }

  updatedetails(scl:School){
    this.http.put(this.url+"/"+scl.id,scl).subscribe();
    return "Record Updated";
  }

  deletedetails(scl:School){
    this.http.delete(this.url+"/"+scl.id).subscribe();
    return "Record Deleted";
  }
}
