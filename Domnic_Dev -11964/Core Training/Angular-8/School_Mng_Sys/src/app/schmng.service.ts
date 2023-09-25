import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { School } from './model/school';
@Injectable({
  providedIn: 'root'
})
export class SchmngService {

  private url:string = "http://localhost:3004/posts"

  constructor(private http: HttpClient) { 
  
  }
  insertDetails(school:School) {
    this.http.post(this.url, school).subscribe();
    return "Record Inserted";
  }
  updateDetails(school: School) {
    this.http.put(this.url + "/" + school.id, school).subscribe();
    return "Record Updated";
  }
  deleteDetails(school: School) {
    this.http.delete(this.url + "/" + school.id).subscribe();
    return "Record Deleted";
  }
  getAllDetails(){
   return this.http.get<School[]>(this.url)
  }

}
