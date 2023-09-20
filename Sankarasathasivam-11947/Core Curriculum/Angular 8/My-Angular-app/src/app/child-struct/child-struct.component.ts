import { Component } from '@angular/core';

@Component({
  selector: 'app-child-struct',
  templateUrl: './child-struct.component.html',
  styleUrls: ['./child-struct.component.css']
})
export class ChildStructComponent {
  flag:boolean;
   vehicles:string[];
   selectedVehicle : string ="";

   constructor(){
    this.flag=true;
    this.vehicles=["bike","car","lorry"];
    
   }

   changeFlag(){
    this.flag=! this.flag;
   }

   setSelectedVehicle(selectedVehicle : string){
    this.selectedVehicle = selectedVehicle;
  }
}
