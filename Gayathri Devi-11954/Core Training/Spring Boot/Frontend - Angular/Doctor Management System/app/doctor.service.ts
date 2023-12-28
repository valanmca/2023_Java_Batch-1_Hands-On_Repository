import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  constructor(private _http:HttpClient) { }

  
  private url: string = 'http://localhost:1234';

  addDoctors(data:any):Observable<any>{
    return this._http.post(this.url+"/insert",data);
  }

  getAllDoctors():Observable<any>{
    return this._http.get(this.url+"/view");
  }

  deleteDoctors(id:number):Observable<any>{
    return this._http.delete(this.url+"/delete/"+id);
  }
  updateDoctors(id:number, data:any):Observable<any>{
    return this._http.put(this.url+"/update",data);
  }
}
