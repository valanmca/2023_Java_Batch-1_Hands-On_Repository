import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Movie } from './model/moviemodel';

@Injectable({
  providedIn: 'root'
})
export class DataService {
    //  private url:string="http://localhost:3000/posts";
    private url:string="http://localhost:1234";
  
  
    constructor(private http:HttpClient) { }
    insert(movi : Movie)
    {
      this.http.post(this.url+"/PerformInsert",movi).subscribe();
      return "Record Inserted"
    }
    update(movi:Movie)
    {
      this.http.put(this.url+"/PerformUpdate",movi).subscribe();
      return "Record updated"
    }
  
  
    delete(movi:Movie)
    {
      this.http.delete(this.url+"/PerformDelete/"+movi.id).subscribe();
      return "Record Deleted"
    }
    getAlldetails()
    {
      return this.http.get<Movie[]>(this.url+"/PerformAll");
    }
  
  
  
}
