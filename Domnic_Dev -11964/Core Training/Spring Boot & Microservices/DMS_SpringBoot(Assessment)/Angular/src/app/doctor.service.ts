import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Doctor } from './model/Doctor';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  private url: string = "http://localhost:3040";
  constructor(private http: HttpClient) { }

  insertDoctor(doctor: Doctor) {
    this.http.post(this.url + "/PerformInsert", doctor).subscribe();
    return "Record Inserted";
  }
  updateDoctor(doctor: Doctor) {
    this.http.put(this.url + "/PerformUpdate", doctor).subscribe();
    return "Record Updated";
  }
  deleteDoctor(doctor:Doctor){
    this.http.delete(this.url+"/PerformDelete/"+doctor.dId).subscribe();
    return "Record Deleted";
   }
   getAllDoctorDetails(){
    return this.http.get<Doctor[]>(this.url+"/ViewAll");
    
  }}
