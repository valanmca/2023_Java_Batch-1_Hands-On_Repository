import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
  sum : number;
  sub : number;
  

  constructor(private calc : CalculatorService)
  {
    this.sum=calc.getAddition(10,10);
    this.sub=calc.getSubtraction(50,20);
  
  }
}
