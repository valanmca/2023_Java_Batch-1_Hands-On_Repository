import { Component } from '@angular/core';

@Component({
  selector: 'app-assignment3',
  templateUrl: './assignment3.component.html',
  styleUrls: ['./assignment3.component.css']
})
export class Assignment3Component {
  fruits: Fruit[] =[  
    {name:'Strawberries',carbohydrate:'6g',water:'92%',calories:'30kcal'},  
    {name:'Watermelon',carbohydrate:'7g',water:'92%',calories:'33kcal'},  
    {name:'Orange',carbohydrate:'8g',water:'87%',calories:'40kcal'},  
    {name:'Apple',carbohydrate:'12g',water:'84%',calories:'60kcal'}, 
    {name:'Grapes',carbohydrate:'15g',water:'80%',calories:'66kcal'},  
    {name:'Blueberries',carbohydrate:'15g',water:'85%',calories:'70kcal'},  
    {name:'Banana',carbohydrate:'23g',water:'75%',calories:'95kcal'},  
    {name:'Pure fruit juice(250ml)',carbohydrate:'25g',water:'85%',calories:'125kcal'},  
    {name:'Dates',carbohydrate:'65g',water:'20%',calories:'290kcal'}, 
    {name:'Raisins',carbohydrate:'70g',water:'15%',calories:'295kcal'},    
]   
}
class Fruit{
  name! : string;
  carbohydrate! : string;
  water! : string;
  calories! : string;
}
