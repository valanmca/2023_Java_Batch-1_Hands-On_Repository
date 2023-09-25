import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http';
import { Teacher } from './Model/teacher';

@Injectable({
  providedIn: 'root'
})
export class TeachermngService {
 
  private url:string="http://localhost:3004/posts";

  constructor(private http:HttpClient) { }

  insertdetails(tchr:Teacher){
    this.http.post(this.url,tchr).subscribe();
    return "Record Inserted";
  }

}
