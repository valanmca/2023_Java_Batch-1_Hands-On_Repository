import { Component } from '@angular/core';
import { Vehicle } from './Model/Vehicle';
import { VehicleService } from './vehicle.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Vehicle-http';

  constructor(private service : VehicleService)
  {
    this.vehicle=new Vehicle();
    this.getAllVehicles();
  
  }
  
  

  vehicle : Vehicle;
  result : string ="";
  vehList : Vehicle[] = [];
  
 
    form1={
      id:"",
      owner:"",
      name:"",
      num:"",
      type:""
    }

    crud()
    {
      console.log(this.form1);
    }

    insertVehicle(data:any)
    {
     this.vehicle.id =data.id;
     this.vehicle.owner=data.owner;
     this.vehicle.name=data.name;
     this.vehicle.num=data.num;
     this.vehicle.type=data.type;

     this.result=this.service.insertVehicle(this.vehicle);

     this.getAllVehicles(); //to update automatically by not reusing the code
    }

    updateVehicle(data:any) 
    {
     this.vehicle.id =data.id;
     this.vehicle.owner=data.owner;
     this.vehicle.name=data.name;
     this.vehicle.num=data.num;
     this.vehicle.type=data.type;

     this.result=this.service.updateVehicle(this.vehicle);

     this.getAllVehicles(); //to update changes automatically by not reusing the code
    }

    deleteVehicle(data:any)
    {
     this.vehicle.id =data.id;
     this.vehicle.owner=data.owner;
     this.vehicle.name=data.name;
     this.vehicle.num=data.num;
     this.vehicle.type=data.type;

     this.result=this.service.deleteVehicle(this.vehicle);

     this.getAllVehicles(); //to update automatically by not reusing the code
    }

    getAllVehicles()
    {
      this.service.getAllVehicleDetails().subscribe(vehicles=> this.vehList = vehicles);
    }
}
