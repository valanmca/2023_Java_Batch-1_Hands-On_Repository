import { Component } from '@angular/core';

@Component({
  selector: 'app-factorial',
  templateUrl: './factorial.component.html',
  styleUrls: ['./factorial.component.css']
})
export class FactorialComponent {


  listvalue:number[];
  constructor(){
    this.listvalue=[1,2,3,4,5,6,7,8,9,10];
  }

  
  getfact( n:number):number{
    let fact=1;
    for(let i=1;i<=n;i++)
    {
      fact=fact*i;
      
    }
    return fact;

  }

}
