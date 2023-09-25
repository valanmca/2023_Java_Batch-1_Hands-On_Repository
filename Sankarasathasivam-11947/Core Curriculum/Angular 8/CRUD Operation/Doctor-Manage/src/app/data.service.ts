import { Injectable } from '@angular/core';
import { Doctor } from './model/Doctor';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DataService {
  private url: string = "http://localhost:1001/posts";

  constructor(private http: HttpClient) { }
  insert(doctor: Doctor) {
    this.http.post(this.url, doctor).subscribe();
    return "Record Inserted";
  }
  update(doctor:Doctor){
    this.http.put(this.url+"/"+doctor.id,doctor).subscribe();
    return "Record Updated";
  }
  delete(doctor:Doctor){
    this.http.delete(this.url+"/"+doctor.id).subscribe();
    return "Record Deleted";
  }
  getAllDetails(){
    return this.http.get<Doctor[]>(this.url);
  }
}
