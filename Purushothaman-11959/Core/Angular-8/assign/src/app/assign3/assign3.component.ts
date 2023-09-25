import { Component } from '@angular/core';

@Component({
  selector: 'app-assign3',
  templateUrl: './assign3.component.html',
  styleUrls: ['./assign3.component.css']
})
export class Assign3Component {
  fruit:string[];
  carb:number[];
  water:number[];
  calories:number[];

  constructor(){
    this.fruit=["Strawberries","Watermelon","Orange","Apple","Grapes","Blueberries","Banana","Pure Fruit Jiuce(250ml)","Dates","Raisins"];
    this.carb=[6,7,8,12,15,15,23,25,65,70];
    this.water=[92,92,87,84,80,85,75,85,20,15];
    this.calories=[30,33,40,60,66,70,95,125,290,295];
  }

}
