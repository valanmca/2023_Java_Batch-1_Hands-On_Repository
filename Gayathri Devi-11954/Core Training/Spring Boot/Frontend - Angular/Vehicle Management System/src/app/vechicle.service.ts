import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VechicleService {

  constructor(private _http:HttpClient) { }

  private url: string = 'http://localhost:2345';

  addVechicles(data:any):Observable<any>{
    return this._http.post(this.url+"/performInsert",data);
  }

  getAllVechiles():Observable<any>{
    return this._http.get(this.url+"/ViewAll");
  }

  deleteVehicles(id:number):Observable<any>{
    return this._http.delete(this.url+"/performDelete/"+id);
  }
  updateVehicle(id:number, data:any):Observable<any>{
    return this._http.put(this.url+"/performUpdate",data);
  }
}


/* @Injectable({
  providedIn: 'root'
  })
  export class VechicleService {
  constructor(private _http:HttpClient) { }
  private url: string = 'http://localhost:3000/posts'
  addVechicles(data:any):Observable<any>{
  return this._http.post(this.url,data);
  }
  getAllVechiles():Observable<any>{
  return this._http.get(this.url);
  }
  deleteVehicles(id:number):Observable<any>{
  return this._http.delete(this.url+"/"+id);
  }
  updateVehicle(id:number, data:any):Observable<any>{
  return this._http.put(this.url+"/"+id,data);
  }
  } */