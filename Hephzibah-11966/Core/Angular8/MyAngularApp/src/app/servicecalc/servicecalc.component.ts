import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-servicecalc',
  templateUrl: './servicecalc.component.html',
  styleUrls: ['./servicecalc.component.css']
})
export class ServicecalcComponent {
num1:number=0
num2:number=0;
factorial:number;
result:number=0;
  constructor(private calc: CalculatorService, private fact:FactorialService){
    this.factorial = fact.getFactorial(5)
  }
  getAdd(){
    this.result=this.calc.getAddition(this.num1,this.num2)
  }
  getSub(){
    this.result=this.calc.getSubtraction(this.num1,this.num2)
  }
  getMult(){
    this.result=this.calc.getMultiplication(this.num1,this.num2)
  }
  getDiv(){
    this.result=this.calc.getDivision(this.num1,this.num2)
  }

}
