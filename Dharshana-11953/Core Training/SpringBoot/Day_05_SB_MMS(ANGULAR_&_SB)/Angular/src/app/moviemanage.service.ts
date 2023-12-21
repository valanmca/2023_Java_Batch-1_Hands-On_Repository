import { Injectable } from '@angular/core';
import {  Movie } from './model/mov';
import{HttpClient} from '@angular/common/http'


@Injectable({
  providedIn: 'root'
})
export class MoviemanageService {
  
  private url:string="http://localhost:1234";

  constructor( private http:HttpClient) { }

  insert(movie:Movie)
  {
    this.http.post(this.url+"/PerformInsert",movie).subscribe();
    return "Record Inserted";

  }
  update(movie:Movie)
  {
    this.http.put(this.url+"/PerformUpdate",movie).subscribe();
    return "Record updated"
  }


  delete(movie:Movie)
  {
    this.http.delete(this.url+"/PerformDelete/"+movie.id).subscribe();
    return "Record Deleted"
  }

  getAlldetails(){
     return this.http.get<Movie[]>(this.url+"/ViewAll");
  }
}
