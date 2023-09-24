import { Component } from '@angular/core';
import { MuthuService } from '../muthu.service';
import { muthu2Service } from '../muthu2.service';

@Component({
  selector: 'app-cal',
  templateUrl: './cal.component.html',
  styleUrls: ['./cal.component.css']
})
export class CalComponent {
  sum:number;
  sub:number;
  mul:number;
  div:number;
 fact:number;

  constructor(private muthuservice : MuthuService, private factorial:muthu2Service){
    this.sum=muthuservice.getaddition(10,20);
    this.sub=muthuservice.getsubtraction(10,20);
    this.mul=muthuservice.getmultiplication(10,20);
    this.div=muthuservice.getdivison(10,20);
    this.fact=muthuservice.getFactorial(5);
}
}
