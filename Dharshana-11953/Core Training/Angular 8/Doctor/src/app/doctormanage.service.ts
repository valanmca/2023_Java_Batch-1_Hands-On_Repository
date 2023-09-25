import { Injectable } from '@angular/core';
import { Doctor } from 'src/model/doc';
import{HttpClient} from '@angular/common/http'


@Injectable({
  providedIn: 'root'
})
export class DoctormanageService {
  private url:string="http://localhost:3004/posts"

  constructor( private http:HttpClient) { }

  insert(doctor:Doctor)
  {
    this.http.post(this.url,doctor).subscribe();
    return "record Inserted";

  }
  update(doctor:Doctor)
  {
    this.http.put(this.url+"/"+doctor.id,doctor).subscribe();
    return "Record updated"
  }


  delete(doctor:Doctor)
  {
    this.http.delete(this.url+"/"+doctor.id).subscribe();
    return "Record Deleted"
  }

  getAlldetails(){
     return this.http.get<Doctor[]>(this.url);
  }
}
