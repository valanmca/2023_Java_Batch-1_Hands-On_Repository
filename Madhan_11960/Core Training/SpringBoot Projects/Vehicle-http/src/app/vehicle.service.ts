import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Vehicle } from './Model/Vehicle';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {

  private url : string="http://localhost:1353";

  constructor(private http : HttpClient) { }

  insertVehicle(vehicle : Vehicle)
  {
    this.http.post(this.url+"/PerformInsert", vehicle).subscribe();
    return "Record Inserted";

  }

  updateVehicle(vehicle : Vehicle)
  {
    this.http.put(this.url+"/PerformUpdate", vehicle).subscribe();
    return "Record Updated";

  }

  deleteVehicle(vehicle : Vehicle)
  {
    this.http.delete(this.url+"/PerformDelete/"+vehicle.id).subscribe();
    return "Record Deleted";

  }


  getAllVehicleDetails()
  {
    return this.http.get<Vehicle[]>(this.url+"/ViewAll");
  }

}
