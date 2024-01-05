import { Injectable } from '@angular/core';
import { Movie } from './Model/Movie';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  private url:string="http://localhost:2020";

  constructor(private http:HttpClient) { }

  insertdetails(mov : Movie){
    this.http.post(this.url+"/PerformInsert",mov).subscribe();
    return "Record Inserted";
  }

  getAllMovieDetails(){
    return this.http.get<Movie[]>(this.url+"/ViewAll");
  }

  updatedetails(mov : Movie){
    this.http.put(this.url+"/PerformUpdate",mov).subscribe();
    return "Record Updated";
  }

  deletedetails(mov:Movie){
    this.http.delete(this.url+"/PerformDelete/"+mov.movieId).subscribe();
    return "Record Deleted";
   }
}
