import { Component } from '@angular/core';

@Component({
  selector: 'app-strucdirective',
  templateUrl: './strucdirective.component.html',
  styleUrls: ['./strucdirective.component.css']
})
export class StrucdirectiveComponent {
flag:boolean;
vehicle : string[];
selectedVehicle : string = "";
constructor(){
  this.flag=true;
  this.vehicle = ["Two Wheeler","Three Wheeler","Four Wheeler"]
}
changeFlag(){
  this.flag=! this.flag;
}
 setSelectedVehicle(selectedVehicle : string){
   this.selectedVehicle = selectedVehicle;
   }
}
