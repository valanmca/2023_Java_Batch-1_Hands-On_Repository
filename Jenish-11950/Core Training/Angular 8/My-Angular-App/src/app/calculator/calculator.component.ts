import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
  sum: number;
  sub: number;
  fac: number;
  

  getAddtion() {

  }

  getSubtraction() {

  }

 

  constructor(private calc: CalculatorService, fact:FactorialService) {
    this.sum = calc.getAddtion(5, 5);
    this.sub = calc.getSubtraction(10, 5);
    this.fac = fact.getFact(5);

  }
}
