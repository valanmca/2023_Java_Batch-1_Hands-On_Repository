import { Component } from '@angular/core';

@Component({
  selector: 'app-fruit',
  templateUrl: './fruit.component.html',
  styleUrls: ['./fruit.component.css']
})
export class FruitComponent {
  fruit:string[];
  carbohydrate: string[];
  water: string[];
  calories: string[];

  constructor(){
    this.fruit=["Strawberries","Watermelon","Orange","Apple","Grapes","Blueberries","Banana","Pure Fruit Juice(250ml)","Dates","Raisins"];
    this.carbohydrate=["6g","7g","12g","15g","15g","23g","25g","65g","70g","80g"];
    this.water=["92%","92%","87%","84%","80%","85%","75%","85%","20%","15%"];
    this.calories=["30kacl","33kacl","40kacl","60kacl","66kacl","70kacl","95kacl","125kacl","290kacl","295kacl"]
  }
}
