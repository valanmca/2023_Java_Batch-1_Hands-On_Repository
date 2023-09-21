import { Component } from '@angular/core';

@Component({
  selector: 'app-child-struct',
  templateUrl: './child-struct.component.html',
  styleUrls: ['./child-struct.component.css']
})
export class ChildStructComponent {
  flag:boolean;
  vehicles:string[];
   selectedVehicle:string="";

constructor(){
 this.flag=true;
this.vehicles=["Two Wheeler","Three Wheeler","Four Wheeler"];


 }
changeFlag(){
   this.flag=! this.flag;
 }

 setSelectedVehicle(vehicle:string){
 this.selectedVehicle=vehicle;

 }

}
