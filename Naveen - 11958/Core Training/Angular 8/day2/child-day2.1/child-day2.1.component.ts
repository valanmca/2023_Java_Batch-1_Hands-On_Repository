import { Component } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child-day2.1.component.html',
  styleUrls: ['./child-day2.1.component.scss']
})
export class ChildDay21Component {

  flag: boolean;
  vehicle: string[];
  selectedVehicle : string = "";

  constructor(){
    this.flag = true;
    this.vehicle = ["Two Wheelers", "Three Wheelers", "Four Wheelers"];
  }

  changeFlag(){
     this.flag = ! this.flag;
  }
  
  setSelectedVehicle(selectedVehicle : string){
  this.selectedVehicle = selectedVehicle;
  }
}
