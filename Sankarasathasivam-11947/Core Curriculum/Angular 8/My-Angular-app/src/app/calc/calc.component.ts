import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-calc',
  templateUrl: './calc.component.html',
  styleUrls: ['./calc.component.css']
})
export class CalcComponent {
  mul: number;
  divi: number;
  fact1:number;

  constructor(private calc: CalculatorService,private fact:FactorialService) {
    this.mul = this.calc.getMultiplication(10, 20);
    this.divi = this.calc.getDivision(10, 2);
    this.fact1 = this.fact.getfactorial(5);
  }
}
