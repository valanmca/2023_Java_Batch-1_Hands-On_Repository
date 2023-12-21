import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Vehicle } from './model/Vehicle';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {

  private url : string="http://localhost:9080"
  constructor(private http:HttpClient) { }

  insertVehicle(vehicle : Vehicle){
    this.http.post(this.url + "/PerformInsert",vehicle).subscribe();
    return "Vehicle Inserted";
  }

  updateVehicle(vehicle : Vehicle){
    this.http.put(this.url + "/PerformUpdate",vehicle).subscribe();
    return "Vehicle Updated";
  }

  deleteVehicle(vehicle : Vehicle){
    this.http.delete(this.url + "/PerformDelete/"+vehicle.vehicleId).subscribe();
    return "Vehicle Deleted";
  }

  getAllVehiclesDetails(){
    return this.http.get<Vehicle[]>(this.url+"/ViewAll");
  }
}
