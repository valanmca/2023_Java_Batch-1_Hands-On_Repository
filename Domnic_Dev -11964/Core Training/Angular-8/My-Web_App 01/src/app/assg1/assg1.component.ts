import { Component } from '@angular/core';

@Component({
  selector: 'app-assg1',
  templateUrl: './assg1.component.html',
  styleUrls: ['./assg1.component.css']
})
export class Assg1Component {
  Factorial:number[];
  constructor(){
    this.Factorial=[1,2,3,4,5,6,7,8,9,10]
  }
  getfact(Fac:number):number
  
  {
    let fact=1;
    for(let i=1;i<=Fac;i++){
       fact=fact*i;
    }
    return fact;
  }
}
