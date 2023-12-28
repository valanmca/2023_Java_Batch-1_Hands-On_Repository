import { Injectable } from '@angular/core';
import { Vehicle } from './model/vehicle';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  //private url:string="http://localhost:3004/posts";
  private url:string = "http://localhost:1234";


  constructor(private http: HttpClient) { }

  insert(vehicle: Vehicle) {
    this.http.post(this.url+"/PerformInsert", vehicle).subscribe();
    return "Record Inserted"
  }
  update(vehicle: Vehicle) {
    this.http.put(this.url+ "/PerformUpdate", vehicle).subscribe();
    return "Record updated"
  }


  delete(vehicle: Vehicle) {
    this.http.delete(this.url + "/PerformDelete/" + vehicle.id).subscribe();
    return "Record Deleted"
  }
  getAlldetails() {
    return this.http.get<Vehicle[]>(this.url+"/ViewAll");
  }
}
