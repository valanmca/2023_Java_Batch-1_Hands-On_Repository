
import { VehicleService } from './vehicle.service';
import { Vehicle } from './model/Vehicle';
import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  vehicle:Vehicle;
  result:string="";
  vehicleList: Vehicle[] = [];
  
  
  constructor(private service:VehicleService){
    this.vehicle=new Vehicle;
    this.getAllVehicles();

  
  }

insertVehicle(data:any){
  this.vehicle.vId=data.vId;
  this.vehicle.vName=data.vName;
  this.vehicle.vCompany=data.vCompany;
  this.vehicle.vPrice=data.vPrice;
  this.result=this.service.insertVehicle(this.vehicle);
  this.getAllVehicles();


}
updateVehicle(data:any){
  this.vehicle.vId=data.vId;
  this.vehicle.vName=data.vName;
  this.vehicle.vCompany=data.vCompany;
  this.vehicle.vPrice=data.vPrice;
  this.result=this.service.updateVehicle(this.vehicle);
  this.getAllVehicles();


}
deleteVehicle(data:any){
  this.vehicle.vId=data.vId;
  
  this.result=this.service.deleteVehicle(this.vehicle);
  this.getAllVehicles();

}
getAllVehicles() {
  this.service.getAllVehicleDetails().subscribe(vehicles => this.vehicleList = vehicles);
}
}
