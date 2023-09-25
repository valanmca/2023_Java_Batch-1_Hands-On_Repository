import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent {
  sum:number;
  sub:number;
  mul:number;
  div:number;
  fac:number;
  getAddition(){

  }

  getSubtraction(){

  }

  getMultiplication(){

  }

  getDivision(){

  }

  constructor(private calc:CalculatorService,fact:FactorialService){
    this.sum=calc.getAddition(10,20);
    this.sub=calc.getSubtraction(20,10);
    this.mul=calc.getMultiplication(20,10);
    this.div=calc.getDivision(20,10);
    this.fac=fact.getfactorial(5);
  }
}
