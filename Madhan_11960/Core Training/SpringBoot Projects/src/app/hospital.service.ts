import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { hospital } from './Model/hospital';

@Injectable({
  providedIn: 'root'
})
export class HospitalService {

  private url : string ="http://localhost:3200/posts";

  constructor(private http : HttpClient) { }

  inserthospital(employee : hospital)
  {
    this.http.post(this.url, hospital).subscribe();
    return "Record Inserted";

  }

  updatehospital(employee : hospital)
  {
    this.http.put(this.url+"/"+hospital.name, hospital).subscribe();
    return "Record Updated";

  }

  deletehospital(employee : hospital)
  {
    this.http.delete(this.url+"/"+hospital.name).subscribe();
    return "Record Deleted";

  }


  getAllhospitalDetails()
  {
    return this.http.get<hospital[]>(this.url);
  }


}
