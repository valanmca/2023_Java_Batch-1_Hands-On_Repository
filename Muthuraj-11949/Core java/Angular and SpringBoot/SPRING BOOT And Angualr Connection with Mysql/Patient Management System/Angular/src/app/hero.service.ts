import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Patient } from './model/Patient';

@Injectable({
  providedIn: 'root'
})
export class  HeroService{

  private url:string = "http://localhost:1234";
constructor(private http: HttpClient) {
}
insertPatient(patient : Patient){
  this.http.post(this.url+"/PerformInsert",patient).subscribe();
  return "Record Inserted";
}
updatePatient(patient: Patient) {
  this.http.put(this.url + "/PerformUpdate" ,patient).subscribe();
  return "Record Updated";
}
deletePatient(patient: Patient) {
  this.http.delete(this.url+"/PerformDelete/"+patient.patId).subscribe();
  return "Record Deleted";
}
getAllPatient(){
 return this.http.get<Patient[]>(this.url+"/viewAll");
}
}

