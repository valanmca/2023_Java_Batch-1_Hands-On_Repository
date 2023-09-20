import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-calculator1',
  templateUrl: './calculator1.component.html',
  styleUrls: ['./calculator1.component.css']
})
export class Calculator1Component {
  mul:number;
  div:number;
  factorial:number;
  constructor( private calc:CalculatorService,private fact:FactorialService){
       this.mul=calc.getSubtraction(3,20);
    this.div=calc.getSubtraction(30,5);
    this.factorial=fact.getFactorial(5);

  

  }
}
