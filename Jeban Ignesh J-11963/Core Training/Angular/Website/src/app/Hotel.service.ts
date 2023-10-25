import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Travel } from './Model/Travel';

@Injectable({
  providedIn: 'root'
})
export class HotelService {

  private url: string = "http://localhost:3004/posts"

  constructor(private http: HttpClient) { }
  InsertTravel(travel: Travel) {
    this.http.post(this.url, travel).subscribe();
    return "Record Updated"
  }
  UpdateTravel(travel: Travel) {
    this.http.put(this.url + "/" + travel.id, travel).subscribe();
    return "Record Updated";
  }
  DeleteTravel(travel: Travel) {
    this.http.delete(this.url + "/" + travel.id).subscribe();
    return "Record Deleted"
  }
  getAllTravelsDetails() {
    return this.http.get<Travel[]>(this.url);

  }
}
