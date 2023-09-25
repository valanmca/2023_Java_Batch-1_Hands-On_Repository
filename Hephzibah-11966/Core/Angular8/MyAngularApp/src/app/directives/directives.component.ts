import { Component } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent {
  flag : boolean;
  vehicles: string[];
  selectedVehicle : string = "";
  mycolor:string;
  myclass : String;
    

constructor(){
  this.flag=true;
  this.vehicles = ["Two Wheeler","Three Wheeler","Four Wheeler"];
  this.mycolor = "green";
  this.myclass="MyClass1";
} 

changeFlag(){
  this.flag=! this.flag;
}
setSelectedVehicle(vec : string){
  this.selectedVehicle = vec;
}
changestyle(){
  if(this.mycolor == "green"){
    this.mycolor ="red";}
  else{
    this.mycolor = "green";
  }  

  }
  changecolor(){
    this.myclass="MyClass2";
  }
  

}



