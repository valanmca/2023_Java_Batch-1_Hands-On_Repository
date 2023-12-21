import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VechicleService {

  constructor(private _http:HttpClient) { }

  private url: string = 'http://localhost:1122';

  addVechicles(data:any):Observable<any>{
    return this._http.post(this.url+"/PerformInsert",data);
  }

  getAllVechiles():Observable<any>{
    return this._http.get(this.url+"/ViewAll");
  }

  deleteVehicles(id:number):Observable<any>{
    return this._http.delete(this.url+"/PerformDelete/"+id);
  }
  updateVehicle(id:number, data:any):Observable<any>{
    return this._http.put(this.url+"/PerformUpdate",data);
  }
}
