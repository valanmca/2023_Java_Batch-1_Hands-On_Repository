import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MobileService {

  constructor(private _http:HttpClient) { }

  private url: string = 'http://localhost:0107';

  addMobiles(data:any):Observable<any>{
    return this._http.post(this.url+"/PerformInsert",data);
  }

  getAllMobile():Observable<any>{
    return this._http.get(this.url+"/ViewAll");
  }

  deleteMobiles(id:number):Observable<any>{
    return this._http.delete(this.url+"/PerformDelete/"+id);
  }
  updateMobile(id:number, data:any):Observable<any>{
    return this._http.put(this.url+"/PerformUpdate",data);
  }
}
