import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
  sum : number;
  sub : number;
  mul : number;
  div : number;

  num1 : number=0;
  num2 : number=0;
  res : number=0;
  fact : number;

  constructor(private calc : CalculatorService,private fac:FactorialService){
    this.sum=calc.getAddition(30,20);
    this.sub=calc.getSubtraction(40,20);
    this.mul=calc.getMultiplication(3,17);
    this.div=calc.getDivision(40,2);
    this.fact=fac.getfactorial(10);
    this.res=calc.getAddition(this.num1,this.num2);
    this.res=calc.getSubtraction(this.num1,this.num2);
    this.res=calc.getMultiplication(this.num1,this.num2);
    this.res=calc.getDivision(this.num1,this.num2);
  }
  getadd(){

    this.res=this.calc.getAddition(this.num1,this.num2);

  }
  getsub(){
    this.res=this.calc.getSubtraction(this.num1,this.num2);
  }
  getmul(){
    this.res=this.calc.getMultiplication(this.num1,this.num2);
  }
  getdiv(){
    this.res=this.calc.getDivision(this.num1,this.num2);
  }
  

}
