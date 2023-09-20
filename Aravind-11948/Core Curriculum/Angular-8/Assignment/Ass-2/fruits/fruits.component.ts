import { Component } from '@angular/core';

@Component({
  selector: 'app-fruits',
  templateUrl: './fruits.component.html',
  styleUrls: ['./fruits.component.css']
})
export class FruitsComponent {
  fruit:string[]
 carbohydrate:string[]
 water:string[]
 calories:string[]
 constructor(){
  this.fruit=["Strawberries","Watermelon","Orange","Apple","Grapes","Blueberries","Banana","Pure Fruit Juice(250ml)","Dates","Raisins"]
  this.carbohydrate=["6g","7g","8g","12g","15g","15g","23g","25g","65g","70g"]
  this.water=["92%","92%","87%","84%","80%","85%","75%","85%","20%","15%"]
  this.calories = ["30kcal","33kcal","40kcal","60kcal","66kcal","70kcal","95kcal","125kcal","290kcal","295kcal"]
 }

}
