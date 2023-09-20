import { Component } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {
  arr:number[];
  constructor(){
    this.arr=[1,2,3,4,5,6,7,8,9,10];
  }

  // myFunction(value:any)
  // {
  //   alert(value.name);
  // }
myfunction(data:any)
{
  alert(data.name);
}
}
