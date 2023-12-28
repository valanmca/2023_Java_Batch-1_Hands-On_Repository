import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ApiService {
 /*  [x: string]: any; */

  //private url :string ="http://localhost:1234";
  constructor(private http : HttpClient) { }

  postProduct(data : any):Observable<any>{
   // return this.http.post<any>("http://localhost:3000/productList/",data);
    return this.http.post<any>("http://localhost:1234/PerformInsert",data);
  }
  getProduct(){
    //return this.http.get<any>("http://localhost:3000/productList/");
    return  this.http.get<any[]>("http://localhost:1234/ViewAll");
  }
  putProduct(data : any, id : number){
    return this.http.put<any>("http://localhost:3000/productList/"+id,data);
    //return this.http.post<any>("http://localhost:1234/PerformUpdate",data);
  }
  deleteProduct(id:number){
    return   this.http.delete<any>("http://localhost:1234/PerformDelete/"+id );
    //return this.http.delete<any>("http://localhost:3000/productList/"+id);
  }
}
