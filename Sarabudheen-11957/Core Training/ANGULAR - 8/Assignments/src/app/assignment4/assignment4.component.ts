import { Component } from '@angular/core';
import { MultiplicationService } from '../multiplication.service';

@Component({
  selector: 'app-assignment4',
  templateUrl: './assignment4.component.html',
  styleUrls: ['./assignment4.component.css']
})
export class Assignment4Component {
mul : number[];
result :number=0;

constructor( private multiply : MultiplicationService){
  this.mul = [1,2,3,4,5,6,7,8,9,10];
}

getMultiplication(a:number,b:number){
  return this.result = this.multiply.getMultiplicationTable(a,b);
}
}
