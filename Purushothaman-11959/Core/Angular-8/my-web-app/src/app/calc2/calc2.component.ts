import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-calc2',
  templateUrl: './calc2.component.html',
  styleUrls: ['./calc2.component.css']
})
export class Calc2Component {
  mul:number;
  div:number;
  fact:number;
  num:number=0;
  res:number=0;

  constructor(private calc:CalculatorService,private fac:FactorialService){
         this.mul=calc.getMultiplication(10,20);
         this.div=calc.getDivision(20,10);
         this.fact=fac.getFactorial(6);
         this.res=fac.getFactorial(this.num);
  }

  getFact(){
    this.res=this.fac.getFactorial(this.num);
  }

}
