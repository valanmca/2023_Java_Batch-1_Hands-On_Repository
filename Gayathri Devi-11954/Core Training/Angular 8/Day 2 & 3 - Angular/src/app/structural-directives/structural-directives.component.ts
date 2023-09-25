import { Component } from '@angular/core';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent {
  flag : boolean;
  vehicle : string[];
  selectedVehicle : string = "";
  constructor(){
    this.flag= true;
    this.vehicle = ["Two Wheeler","Three Wheeler","Four Wheeler"];
  }
  changeVisible(){
    this.flag = !this.flag;
  }
  
  setSelectedVehicle(selectedVehicle : string){
  this.selectedVehicle = selectedVehicle;
  }
}
