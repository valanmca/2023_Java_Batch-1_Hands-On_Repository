import { Component } from '@angular/core';
import { Vehicle } from './model/vehicle';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular-assessment';
  vehicle: Vehicle;
  result: string = "";
  vecList: Vehicle[] = [];
  vehicleList: Vehicle[] = [];
  flag: boolean = false;
  constructor(private service: DataService) {
    this.vehicle = new Vehicle();
    this.getAllDetails();
  }
  changeDiv() {
    this.flag = !this.flag;
  }


  insert(data: any) {
    this.vehicle.id = data.id;
    this.vehicle.vehicleType = data.vehicleType;
    this.vehicle.vehicleName = data.vehicleName;
    this.vehicle.number1 = data.number1;
    this.vehicle.name = data.name;
    this.result = this.service.insert(this.vehicle);
    this.getAllDetails();


  }
  update(data: any) {
    this.vehicle.id = data.id;
    this.vehicle.vehicleType = data.vehicleType;
    this.vehicle.vehicleName = data.vehicleName;
    this.vehicle.number1 = data.number1;
    this.vehicle.name = data.name;
    this.result = this.service.update(this.vehicle);
    this.getAllDetails();


  }
  delete(data: any) {
    this.vehicle.id = data.id;
    this.vehicle.vehicleType = data.vehicleType;
    this.vehicle.vehicleName = data.vehicleName;
    this.vehicle.number1 = data.number1;
    this.vehicle.name = data.name;
    this.result = this.service.delete(this.vehicle);
    this.getAllDetails();


  }


  getAllDetails() {
    this.service.getAlldetails().subscribe(
      vehicles => this.vehicleList = vehicles
    );


  }
}


