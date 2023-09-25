import { Component } from '@angular/core';
import { MultiplyService } from '../multiply.service';

@Component({
  selector: 'app-assign4',
  templateUrl: './assign4.component.html',
  styleUrls: ['./assign4.component.css']
})
export class Assign4Component {
  a:number=0;
  b:number=0;
  res:number=0;
  col:number[];

  constructor(private tables:MultiplyService){
  
this.col=[1,2,3,4,5,6,7,8,9,10];
  }

  getMultiply(a:number,b:number):number{
    this.a=a;
    this.b=b;
    return this.res=this.tables.getMultiplication(this.a,this.b);

  }

}
