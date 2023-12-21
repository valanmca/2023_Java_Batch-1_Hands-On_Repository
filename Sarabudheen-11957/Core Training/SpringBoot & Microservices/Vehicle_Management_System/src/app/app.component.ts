import { Component } from '@angular/core';
import { Vehicle } from './model/Vehicle';
import { VehicleService } from './vehicle.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  vehicle : Vehicle;
  result : string=" ";
  vehicleList : Vehicle[] = [];

  constructor(private service : VehicleService){
    this.vehicle = new Vehicle;
    this.getAllVehicles();
  }

  insertVehicle(data : any){
    this.vehicle.vehicleId = data.vehicleId;
    this.vehicle.vehicleType = data.vehicleType;
    this.vehicle.vehicleName = data.vehicleName;
    this.vehicle.vehicleNumber = data.vehicleNumber;
    this.vehicle.ownerName = data.ownerName;
    this.result = this.service.insertVehicle(this.vehicle);
    this.getAllVehicles();

  }

  updateVehicle(data : any){
    this.vehicle.vehicleId = data.vehicleId;
    this.vehicle.vehicleType = data.vehicleType;
    this.vehicle.vehicleName = data.vehicleName;
    this.vehicle.vehicleNumber = data.vehicleNumber;
    this.vehicle.ownerName = data.ownerName;
    this.result = this.service.updateVehicle(this.vehicle);
    this.getAllVehicles();


  }

  deleteVehicle(data : any){
    this.vehicle.vehicleId = data.vehicleId;
    this.result = this.service.deleteVehicle(this.vehicle);
    this.getAllVehicles();

  }
  getAllVehicles(){
    this.service.getAllVehiclesDetails().subscribe(vehicle => this.vehicleList = vehicle)
  }
}
