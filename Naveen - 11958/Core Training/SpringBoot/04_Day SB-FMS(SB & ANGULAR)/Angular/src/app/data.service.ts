import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Flight } from './model/flight';

@Injectable({
  providedIn: 'root'
})
export class DataService {

   //private url: string = "http://localhost:3000/posts";
   private url : string = "http://localhost:1234";


   constructor(private http: HttpClient) { }
   insert(flight: Flight) {
     //this.http.post(this.url, vehicle).subscribe();
     this.http.post(this.url+"/PerformInsert", flight).subscribe();
     return "Record Inserted"
   }
   update(flight: Flight) {
     //this.http.put(this.url + "/" + vehicle.id, vehicle).subscribe();
     this.http.put(this.url + "/PerformUpdate", flight).subscribe();
     return "Record updated"
   }
 
 
   delete(flight: Flight) {
     //this.http.delete(this.url + "/" + vehicle.id).subscribe();
     this.http.delete(this.url + "/PerformDelete/" + flight.flightno).subscribe();
     return "Record Deleted"
   }
   getAlldetails() {
     return this.http.get<Flight[]>(this.url+"/ViewAll");
   }
}
