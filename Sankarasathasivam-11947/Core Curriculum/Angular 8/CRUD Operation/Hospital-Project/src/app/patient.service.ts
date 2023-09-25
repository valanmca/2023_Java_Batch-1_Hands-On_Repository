import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Patient } from './model/Patient';


@Injectable({
  providedIn: 'root'
})
export class PatientService {
  private url: string = "http://localhost:4005/posts"

  constructor(private http: HttpClient) { }
  InsertPatient(patient:Patient) {
    this.http.post(this.url, patient).subscribe();
    return "Record Inserted";
  }
}
