import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private _http:HttpClient) { }

  
  private url: string = 'http://localhost:1234';

  addMovies(data:any):Observable<any>{
    return this._http.post(this.url+"/PerformInsert",data);
  }

  getAllMovies():Observable<any>{
    return this._http.get(this.url+"/PerformAll");
  }

  deleteMovies(id:number):Observable<any>{
    return this._http.delete(this.url+"/PerformDelete/"+id);
  }
  updateMovie(id:number, data:any):Observable<any>{
    return this._http.put(this.url+"/PerformUpdate",data);
  }
}
