import { Component } from '@angular/core';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component {
    flag : boolean;
    vehicles : string[];
    selectedVehicle : string = ""; 

    constructor(){
      this.flag = true;
      this.vehicles = ["Two Wheeler","Three Wheeler","Four Wheeler"];
    }

    changeFlag(){
      if (this.flag){
        this.flag = false;
      }
      else{
        this.flag = true;
      }
    }      
    setSelectedVehicle(selectedVehicle : string){
        this.selectedVehicle = selectedVehicle;
    }



}
