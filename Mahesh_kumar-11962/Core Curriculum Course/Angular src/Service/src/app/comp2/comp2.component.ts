import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-comp2',
  templateUrl: './comp2.component.html',
  styleUrls: ['./comp2.component.css']
})
export class Comp2Component {

  num1:number = 0;
  num2:number = 0;
  res:number = 0;
  
  constructor(private calc : CalculatorService)
  {
  this.res = calc.getMultiplication(this.num1,this.num2);
  this.res = calc.getDevision(this.num1,this.num2);
  }
  
  getMul()
  {
   this.res = this.calc.getMultiplication(this.num1,this.num2); 
  }
  
  getDiv()
  {
   this.res = this.calc.getDevision(this.num1,this.num2); 
  }
  
  
}
