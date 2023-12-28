import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class TMSServiceService {

  private url :string ="http://localhost:2345";
  constructor(private http : HttpClient) { }

  postTeacher(data : any):Observable<any>{
    //return this.http.post<any>("http://localhost:3000/TeacherList/",data);
    return this.http.post<any>("http://localhost:2345/PerformInsert",data);
  }
  getTeacher():Observable<any>{
    return  this.http.get<any[]>("http://localhost:2345/ViewAll");
  }
  putTeacher(data : any, id : number):Observable<any>{
    return this.http.post<any>("http://localhost:2345/PerformUpdate",data);
  }
  deleteTeacher(id:number):Observable<any>{
    return   this.http.delete<any>("http://localhost:2345/PerformDelete/"+id );
  }
}
