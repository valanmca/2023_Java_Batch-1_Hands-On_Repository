import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private _http:HttpClient) { }

  private url: string = 'http://localhost:3004/posts'

  InsertEmployee(data:any):Observable<any>{
    return this._http.post(this.url, data);
  }
  getAllEmployee():Observable<any>{
    return this._http.get(this.url);
  }

  DeleteEmployee(id:number):Observable<any>{
    return this._http.delete(this.url+"/"+id);
  }

  UpdateEmployee(id:number,data:any):Observable<any>{
    return this._http.put(this.url+"/"+id,data);
  }
}
