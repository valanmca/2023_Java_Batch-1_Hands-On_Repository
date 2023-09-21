import { Component } from '@angular/core';

@Component({
  selector: 'app-child-inter',
  templateUrl: './child-inter.component.html',
  styleUrls: ['./child-inter.component.css']
})
export class ChildInterComponent {
    title='Data binding using String Interpolation';
    numberA: number=10;
    numberB: number=20;

    addTwoNumbers()
    {
      return this.numberA + this.numberB ;
    }
}
