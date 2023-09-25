import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http';
import { College } from './model/College';

@Injectable({
  providedIn: 'root'
})
export class CollegemgsService {

  private url:string="http://localhost:3004/posts";

  constructor(private http:HttpClient) { 

    
  }

  insertdetails(clg:College){
    this.http.post(this.url,clg).subscribe();
    return "Record Inserted";
  }

  getAllDetails(){
     return this.http.get<College[]>(this.url);
  }

  updatedetails(clg:College){
    this.http.put(this.url+"/"+clg.id,clg).subscribe();
    return "Record Updated";
  }

  deletedetails(clg:College){
   this.http.delete(this.url+"/"+clg.id).subscribe();
   return "Record Deleted";
  }
}
