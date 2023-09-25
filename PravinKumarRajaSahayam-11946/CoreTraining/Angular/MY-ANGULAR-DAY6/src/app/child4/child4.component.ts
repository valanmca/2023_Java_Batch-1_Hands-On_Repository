import { Component } from '@angular/core';

@Component({
  selector: 'app-child4',
  templateUrl: './child4.component.html',
  styleUrls: ['./child4.component.css']
})
export class Child4Component {
  fruit:string[]
  carbohydrate:string[]
  water:string[]
  calorie:string[]
  constructor(){
    this.fruit=["Strawberries","Watermelon","Orange","Apple","Grapes","Blueberries","Banana","Pure Fruit Juice(250ml)","Dates","Raisins"]
    this.carbohydrate=["6g","7g","8g","12g","15g","15g","23g","25g","65g","70g"]
    this.water=["92%","92%","87%","84%","80%","85%","75%","85%","20%","15%"]
    this.calorie = ["30 kcal","33 kcal","40 kcal","60 kcal","66 kcal","70 kcal","95 kcal","125 kcal","290 kcal","295 kcal"]
  }
}
