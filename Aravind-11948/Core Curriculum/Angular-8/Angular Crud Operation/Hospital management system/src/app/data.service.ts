import { Injectable } from '@angular/core';
import { Patient } from './model/patient';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class DataService {
  private url:string="http://localhost:3004/posts";

  constructor( private http:HttpClient) { }
  Insert(patients:Patient)
  {
    this.http.post(this.url,patients).subscribe();
    return "Record Inserted"
  }
  Update(patients:Patient){
this.http.put(this.url+"/"+patients.id,patients).subscribe();
return "Record Updated"
  }
  Delete(patients:Patient){
    this.http.delete(this.url+"/"+patients.id).subscribe();
    return "Record Deleted"
  }

  getAllPatient()
  {
    return this.http.get<Patient[]>(this.url);
  }
}
