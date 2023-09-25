import { Component } from '@angular/core';
import { MultiplicationService } from '../multiplication.service';

@Component({
 selector: 'app-multiply',
 templateUrl: './multiply.component.html',
 styleUrls: ['./multiply.component.css']
})
export class MultiplyComponent {
 mul:number[]
 mul1:number = 0
 result:number = 0
 constructor(private multi:MultiplicationService){
  this.mul=[1,2,3,4,5,6,7,8,9,10]
 }
 getMultiplication(a:number,b:number){
  return this.result = this.multi.getMultiply(a,b)
 }
}