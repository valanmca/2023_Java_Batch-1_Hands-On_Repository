import { Injectable } from '@angular/core';
import { Patient } from './model/Patient';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
  private url:string="http://localhost:7778"

  constructor(private http:HttpClient) { }



  insertDetail(patient:Patient)
  {
    this.http.post(this.url+"/PerformInsert",patient).subscribe();
    return "Record inserted";

  }

  updateDetail(patient:Patient)
  {
    this.http.put(this.url+"/PerformUpdate",patient).subscribe();
    return "Record updated";

  }

  deleteDetail(patient:Patient)
  {
    this.http.delete(this.url+"/PerformDelete/"+patient.id).subscribe()
    return "Record Deleted"
  }

  getAlldetails()
  {
    return this.http.get<Patient[]>(this.url+"/ViewAll");
  }

}
