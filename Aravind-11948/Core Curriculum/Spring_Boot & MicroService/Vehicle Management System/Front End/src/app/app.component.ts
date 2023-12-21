import { Component } from '@angular/core';
import { Vehicle } from './model/Vehicle';
import { VehicleService } from './vehicle.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  vehicle:Vehicle;
  result:string="";
  vehList:Vehicle[]=[];
  constructor(private service:VehicleService)
  {
    this.vehicle=new Vehicle;
    this.getAllVehicle();

  }


  insertVehicle(data:any)
  {
    this.vehicle.id=data.id;
    this.vehicle.type=data.type;
    this.vehicle.name=data.name;
    this.vehicle.number=data.number;
    this.vehicle.owner=data.owner;

    this.result=this.service.insertVehicle( this.vehicle);
    this.getAllVehicle();

    
  }


  updateVehicle(data:any)
  {
    this.vehicle.id=data.id;
    this.vehicle.type=data.type;
    this.vehicle.name=data.name;
    this.vehicle.number=data.number;
    this.vehicle.owner=data.owner;

    this.result=this.service.updateVehicle( this.vehicle);
    this.getAllVehicle();

    
  }

  deleteVehicle(data:any)
  {
    this.vehicle.id=data.id;
   
    this.result=this.service.deleteVehicle( this.vehicle);
    this.getAllVehicle();
   
  }
  

  getAllVehicle()
  {
    this.service.getAllVehicle().subscribe(vehicles=>this.vehList=vehicles);

  }
}
