import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Doctor } from './model/Doctor';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {
  private url:string="http://localhost:1030"

  constructor(private http:HttpClient) { }

  insertDoctor(doctor:Doctor)
  {
    this.http.post(this.url+"/PerformInsert",doctor).subscribe();
    return "Record inserted";

  }

  updateDoctor(doctor:Doctor)
  {
    this.http.put(this.url+"/PerformUpdate",doctor).subscribe();
    return "Record updated";

  }

  deletedoctor(doctor:Doctor)
  {
    this.http.delete(this.url+"/PerformDelete/"+doctor.dID).subscribe()
    return "Record Deleted"
  }

  getAllDoctordetail()
  {
    return this.http.get<Doctor[]>(this.url+"/ViewAll");
  }


}
