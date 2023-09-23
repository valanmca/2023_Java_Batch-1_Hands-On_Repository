import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-child4',
  templateUrl: './child4.component.html',
  styleUrls: ['./child4.component.css']
})
export class Child4Component {
sum:number;
sub:number; 



constructor(private calcd: CalculatorService){
  this.sum=calcd.getAddition(10,20);
  this.sub=calcd.getSubraction(30,10);


}



}


