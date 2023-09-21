import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Hospital } from 'Model/Hospital';

@Injectable({
  providedIn: 'root'
})
export class HospitalService {

  constructor(private http:HttpClient) { }

  private url:string = "http://localhost:3004/posts";

  InsertPatient(hospital:Hospital){
      this.http.post(this.url,hospital).subscribe();
      return "Record Inserted";
  }

  UpdatePatient(hospital:Hospital){
    this.http.put(this.url+"/"+hospital.id,hospital).subscribe();
    return "Record Updated";
}

DeletePatient(hospital:Hospital){
  this.http.delete(this.url+"/"+hospital.id).subscribe();
  return "Record Deleted";
}

getAllPatients(){
  return this.http.get<Hospital[]>(this.url);
}
}
