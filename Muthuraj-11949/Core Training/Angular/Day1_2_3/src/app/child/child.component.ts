import { Component } from '@angular/core';
import { MuthuService } from '../muthu.service';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  sum:number;
  sub:number;
  mul:number;
  div:number;
  fact:number;
    constructor(private muthuservice : MuthuService,){
    this.sum=muthuservice.getaddition(10,20);
    this.sub=muthuservice.getsubtraction(10,20);
    this.mul=muthuservice.getmultiplication(10,20);
    this.div=muthuservice.getdivison(10,20);
    this.fact=muthuservice.getFactorial(5);
}}
