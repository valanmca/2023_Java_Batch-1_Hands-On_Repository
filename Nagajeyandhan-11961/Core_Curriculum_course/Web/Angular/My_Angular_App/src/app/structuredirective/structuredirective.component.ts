import { Component } from '@angular/core';

@Component({
  selector: 'app-structuredirective',
  templateUrl: './structuredirective.component.html',
  styleUrls: ['./structuredirective.component.css']
})
export class StructuredirectiveComponent {
  flag:boolean;
  vehicle: string[];
  
  constructor(){
    this.flag = true;
    this.vehicle = ['Two wheeler','Three wheeler','Four wheeler']
  }
  changeFlag(){
    this.flag = ! this.flag;
  }
  selectedVehicle : string = "";
    setSelectedVehicle(vehicles : string){
    this.selectedVehicle = vehicles;
    }
  }
