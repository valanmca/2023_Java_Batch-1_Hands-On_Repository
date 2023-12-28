import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Doctor } from '../ModelTeacher/Doctor';

@Injectable({
  providedIn: 'root'
})
export class ServicetmsService {

  private url:string="http://localhost:2345";


  constructor(private http:HttpClient) { }
  insert(mt : Doctor)
  {
    this.http.post(this.url+"/insert",mt).subscribe();
    return "Record Inserted"
  }
  update(mt:Doctor)
  {
    this.http.put(this.url+"/update",mt).subscribe();
    return "Record updated"
  }


  delete(mt:Doctor)
  {
    this.http.delete(this.url+"/delete/"+mt.id).subscribe();
    return "Record Deleted"
  }
  getAlldetails()
  {
    return this.http.get<Doctor[]>(this.url+"/view");
  }
}

