import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Mobile } from './model/Mobile';
@Injectable({
  providedIn: 'root'
})
export class RajService {
private url:string = "http://localhost:3456";
constructor(private http: HttpClient) {
}
insertMobile(mobile : Mobile){
  this.http.post(this.url+"/PerformInsert",mobile).subscribe();
  return "Record Inserted";
}
updateMobile(mobile: Mobile) {
  this.http.put(this.url + "/PerformUpdate" ,mobile).subscribe();
  return "Record Updated";
}
deleteMobile(mobile: Mobile) {
  this.http.delete(this.url+"/PerformDelete/"+mobile.mobID).subscribe();
  return "Record Deleted";
}
getAllMobile(){
 return this.http.get<Mobile[]>(this.url+"/viewAll");
}
}
