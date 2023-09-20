import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
  sum:number;
  sub:number;
  mul:number;
  div:number;

  num1:number=0
  num2:number=0
  result:number=0

  constructor(private calc:CalculatorService){
    this.sum=calc.getAddition(10,20);
    this.sub=calc.getSubtraction(30,20);
    this.mul=calc.getSubtraction(3,20);
    this.div=calc.getSubtraction(30,5);
     //this.result=calc.getAddition(this.num1,this.num2);

  }

  getadd()
  {
     this.result=this.calc.getAddition(this.num1,this.num2)
  }

  getsub()
  {
     this.result=this.calc.getSubtraction(this.num1,this.num2)
  }

  getmul()
  {
     this.result=this.calc.getMultiplication(this.num1,this.num2)
  }
  getdiv()
  {
     this.result=this.calc.getDivision(this.num1,this.num2)
  }

}
