import { Component } from '@angular/core';

import { Vehicle } from './model/vec';
import { VehiclemanageService } from './vehiclemanage.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'vehicle';
  vehicle:Vehicle;
  result:string="";
  vecList:Vehicle[]=[];
  vehicleList:Vehicle[]=[];
  flag:boolean=false;
  constructor(private service :VehiclemanageService)
  {
    this.vehicle=new Vehicle();
    this.getAllDetails();
  }
  changeDiv(){
    this.flag=!this.flag;
  }

  insert(data:any)
  {
    this.vehicle.id=data.id;
    this.vehicle.name=data.name;
    this.vehicle.type=data.type;
    this.vehicle.number=data.number;
    this.vehicle.oname=data.oname;
    
    this.result=this.service.insert(this.vehicle);
    this.getAllDetails();


  }
  update(data:any)
  {
    this.vehicle.id=data.id;
    this.vehicle.name=data.name;
    this.vehicle.type=data.type;
    this.vehicle.number=data.number;
    this.vehicle.oname=data.oname;

    this.result=this.service.update(this.vehicle);
    this.getAllDetails();


  }
  delete(data:any)
  {
    this.vehicle.id=data.id;
    this.vehicle.name=data.name;
    this.vehicle.type=data.type;
    this.vehicle.number=data.number;
    this.vehicle.oname=data.oname;

    this.result=this.service.delete(this.vehicle);
    this.getAllDetails();


  }


  getAllDetails()
  {
    this.service.getAlldetails().subscribe(
      (      vehicles: Vehicle[])=>this.vehicleList=vehicles
    );


  }
}
