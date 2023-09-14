import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-calc',
  templateUrl: './calc.component.html',
  styleUrls: ['./calc.component.css']
})
export class CalcComponent {
  
  mul : number;
  div : number;
  num : number;
  constructor(private calc : CalculatorService, fact : FactorialService){
    
    this.mul = calc.getMultiplication(10,20);
    this.div = calc.getDivision(10,20);
    this.num = fact.fact(5);
  }
}
