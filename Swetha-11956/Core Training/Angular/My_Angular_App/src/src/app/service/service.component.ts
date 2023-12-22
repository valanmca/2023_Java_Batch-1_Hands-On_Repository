import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent {
  num1: number=0
  num2: number = 0
  factorial = 0
  result: number = 0
  
  constructor(private calc:CalculatorService, private fact:FactorialService){ 
    this.factorial=fact.getFactorial(5);
  }

  getAdd(){
    this.result = this.calc.getAddition(this.num1,this.num2);
  }
  getSub(){
    this.result = this.calc.getSubraction(this.num1,this.num2)
  }
  }

