import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class TMSService{

  private url :string ="http://localhost:2345";
  constructor(private _http : HttpClient) { }

  postTeacher(data : any):Observable<any>{
    //return this.http.post<any>("http://localhost:3000/TeacherList/",data);
    return this._http.post(this.url+"/PerformInsert",data);
  }
  getTeacher():Observable<any>{
    return  this._http.get(this.url+"/ViewAll");
  }
  putTeacher(data : any, id : number):Observable<any>{
    return this._http.put(this.url+"/PerformUpdate",data);
  }
  deleteTeacher(id:number):Observable<any>{
    return   this._http.delete(this.url+"/PerformDelete/"+id );
  }
}
