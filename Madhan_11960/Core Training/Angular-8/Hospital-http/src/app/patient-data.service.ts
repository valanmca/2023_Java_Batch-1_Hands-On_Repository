import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Patient } from './model/Patient';

@Injectable({
  providedIn: 'root'
})
export class PatientDataService {

  private url : string="http://localhost:3100/posts";

  constructor(private http : HttpClient) { }

  insertPatient(patient : Patient)
  {
    this.http.post(this.url, patient).subscribe();
    return "Record Inserted";
  }

  updatePatient(patient : Patient)
  {
    this.http.put(this.url+"/"+patient.id, patient).subscribe();
    return "Record updated";
  }

  deletePatient(patient : Patient)
  {
    this.http.delete(this.url+"/"+patient.id).subscribe();
    return "Record deleted";
  }

  getAllPatientDetails()
  {
    return this.http.get<Patient[]>(this.url);
  }
}
