import { Component } from '@angular/core';
import { MultiplicationService } from '../multiplication.service';

@Component({
  selector: 'app-child5',
  templateUrl: './child5.component.html',
  styleUrls: ['./child5.component.css']
})
export class Child5Component {
  mul:number[]
  mul1:number = 0
  result:number = 0
  constructor(private multi:MultiplicationService){
    this.mul=[1,2,3,4,5,6,7,8,9,10]
  }
  getMultiplication(a:number,b:number){
    return this.result = this.multi.getMultiply(a,b);
  }
}
