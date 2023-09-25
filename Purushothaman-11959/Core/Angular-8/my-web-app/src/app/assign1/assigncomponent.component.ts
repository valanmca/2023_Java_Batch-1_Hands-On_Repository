import { Component } from '@angular/core';

@Component({
  selector: 'app-assigncomponent',
  templateUrl: './assigncomponent.component.html',
  styleUrls: ['./assigncomponent.component.css']
})
export class AssigncomponentComponent {
  Factorial:number[];
  constructor(){
    this.Factorial=[1,2,3,4,5,6,7,8,9,10]
  }

    getfact(a:number): number
  {
    let fact=1;
    for( let i=1;i<=a;i++) {
      fact = fact*i;  
    }
    return fact;  
  }
}
