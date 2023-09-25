import { Component } from '@angular/core';

@Component({
  selector: 'app-assign-fact',
  templateUrl: './assign-fact.component.html',
  styleUrls: ['./assign-fact.component.css']
})
export class AssignFactComponent {
factorial:number[];

constructor(){
  this.factorial=[1,2,3,4,5,6,7,8,9,10]
}

  getfactorial(n:number): number {
    let i=1;
    let fact=1;
    for(i=1; i<=n; i++){
      fact=fact*i;
      
    }
    return fact;

  }

}
