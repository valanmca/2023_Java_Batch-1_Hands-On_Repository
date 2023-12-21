import { Injectable } from '@angular/core';
import { Doctor } from 'src/model/doc';
import{HttpClient} from '@angular/common/http'


@Injectable({
  providedIn: 'root'
})
export class DoctormanageService {
  //private url:string="http://localhost:3004/posts";
  private url:string="http://localhost:1234";

  constructor( private http:HttpClient) { }

  insert(doctor:Doctor)
  {
    this.http.post(this.url+"/PerformInsert",doctor).subscribe();
    return "Record Inserted";

  }
  update(doctor:Doctor)
  {
    this.http.put(this.url+"/PerformUpdate",doctor).subscribe();
    return "Record updated"
  }


  delete(doctor:Doctor)
  {
    this.http.delete(this.url+"/PerformDelete/"+doctor.id).subscribe();
    return "Record Deleted"
  }

  getAlldetails(){
     return this.http.get<Doctor[]>(this.url+"/ViewAll");
  }
}
