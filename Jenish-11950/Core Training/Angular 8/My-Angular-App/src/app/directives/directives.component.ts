import { Component } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent {
  flag: boolean;
  vehicles: string[];
  selectedVehicle: string = "";
  myColor : {};
  myClass : {};

  constructor() {
    this.flag = true;
    this.vehicles = ["Two Wheelers", "Three Wheelers", "Four Wheelers"];
    this.myColor = "green";
    this.myClass = "MyClass";
  }

  changeFlag() {
    this.flag = !this.flag;
  }
  changeStyle(){
    if(this.myColor == "green"){
    this.myColor = "red";
    }
    else {
      this.myColor = "green";
    }
  }

  changingStyle(){
    this.myClass="MyClass2";
  }

  setSelectedVehicle(selectedVehicle: string) {
    this.selectedVehicle = selectedVehicle;
  }

}
