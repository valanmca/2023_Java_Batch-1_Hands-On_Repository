import { Component } from '@angular/core';

@Component({
  selector: 'app-child-factorial',
  templateUrl: './child-factorial.component.html',
  styleUrls: ['./child-factorial.component.css']
})
export class ChildFactorialComponent {
    listValue:number[];
    constructor(){
      this.listValue=[1,2,3,4,5,6,7,8,9,10];
    }

   getfact(n:number) :number{
    let fact=1;
    for(let i=1;i<=n;i++)
    {
      fact=fact*i;
    }
    return fact;
   }
}
