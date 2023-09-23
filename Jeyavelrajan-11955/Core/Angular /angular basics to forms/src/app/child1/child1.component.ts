import { Component } from '@angular/core';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component {
  flag:boolean;
  vehicles: string[];
  selectedVehicle : string = "";



  constructor() {
    this.flag= true;
    this.vehicles=["two Wheeler", "three Wheeler" , "Four Wheeler"];
  }
  changeFlag(){
    this.flag = ! this.flag;
  }
 
     setSelectedVehicle(selectedVehicle : string){
     this.selectedVehicle = selectedVehicle;
    }
  }




