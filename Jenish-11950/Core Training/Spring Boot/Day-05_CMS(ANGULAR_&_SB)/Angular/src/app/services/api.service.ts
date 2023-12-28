import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ApiService {


  constructor(private http : HttpClient) { }


  private url: string = 'http://localhost:1234';


  postCustomer(data : any):Observable<any>{
   
    return this.http.post<any>("http://localhost:1234/PerformInsert", data);
  }


  getCustomer():Observable<any>{
   
    return  this.http.get<[any[]]>("http://localhost:1234/ViewAll");
  }
  putCustomer(data : any, id : number):Observable<any>{
   
    return   this.http.put<any>("http://localhost:1234/PerformUpdate", data );
  }
 


  deleteCustomer(data : any):Observable<any>{
    return this.http.delete(this.url+"/PerformDelete/"+data.id);
  }
}
