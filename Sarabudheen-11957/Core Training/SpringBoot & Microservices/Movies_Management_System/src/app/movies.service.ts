import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Movies } from './model/Movies';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  private url : string="http://localhost:9800"
  constructor(private http:HttpClient) { }

insertMovie(movies : Movies){
  this.http.post(this.url + "/PerformInsert",movies).subscribe;
  return "Movie Inserted"
}
}
