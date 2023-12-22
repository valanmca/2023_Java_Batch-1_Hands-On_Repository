import { Component } from '@angular/core';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css']
})
export class Child1Component {
  flag: boolean;
  vehicles: string[];
  selectedVehicle: string = "";
  myStyle :{};
  myColor:string;
  myClass:string;
  
  

  constructor() {
    this.flag = true;
    this.vehicles = ["Two wheeler", "Three wheeler", "Four wheeler"];
    this.myStyle={'color':'green','cursor':'pointer'};
    this.myColor="green";
    this. myClass="myClass1";
   
  }
  changeFlag() {
    this.flag = !this.flag;
  }
  setSelectedVehicle(selectedVehicle: string) {
    this.selectedVehicle = selectedVehicle;
  }
  ButtonChangeStyle(){
    if(this.myColor=="green"){
      this.myColor="red";
    }
    else{
      this.myColor="green";
    }
  }
  ButtonChangeColor(){
    if(this.myClass=="myClass1"){
     this.myClass="myClass2";
    }
    else{
     this.myClass="myClass1";
    }
  }

}
