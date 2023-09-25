import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Patient } from './model/patient';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  constructor(private http: HttpClient) {

  }
  private url_link: string = "http://localhost:3004/posts";

  insertpatientdetails(patient: Patient) {
    this.http.post(this.url_link, patient).subscribe();
    return "Record inserted successfully";
  }

  updatepatientdetails(patient: Patient) {
    this.http.put(this.url_link+"/"+patient.id,patient).subscribe();
    return "Record updated successfully";
  }

  deletepatientdetails(patient: Patient) {
    this.http.delete(this.url_link+"/"+patient.id).subscribe();
    return "Record deleted successfully";
  }


}
