import { Component } from '@angular/core';

@Component({
  selector: 'app-child-struct',
  templateUrl: './child-struct.component.html',
  styleUrls: ['./child-struct.component.css']
})
export class ChildStructComponent {
  flag:boolean;
  vehicles:string[];
  selectedvehicle:string="";
 
  constructor(){
    this.flag=true;
    this.vehicles=["bike","car","lorry","flight"];
   

  }
  changeFlag(){
    this.flag=! this.flag;
  }

  setselectedvehicle(vehicle:string){
    this.selectedvehicle=vehicle;

  }

 

 

}
