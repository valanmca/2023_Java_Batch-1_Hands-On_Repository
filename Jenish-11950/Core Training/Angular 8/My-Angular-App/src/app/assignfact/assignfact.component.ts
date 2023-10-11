import { Component } from '@angular/core';

@Component({
  selector: 'app-assignfact',
  templateUrl: './assignfact.component.html',
  styleUrls: ['./assignfact.component.css']
})
export class AssignfactComponent {
  factorial : number[];

  constructor() {
    this.factorial = [1,2,3,4,5,6,7,8,9,10,11,12];
  }
  getFact(a: number): number {
    let fact = 1, i;
    for (i = 1; i <= a; i++) {
      fact = fact * i;
    }
    return fact;
  }
}
