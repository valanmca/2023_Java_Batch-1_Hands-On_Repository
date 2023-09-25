import { Component } from '@angular/core';

@Component({
  selector: 'app-child2waybinding',
  templateUrl: './child2waybinding.component.html',
  styleUrls: ['./child2waybinding.component.css']
})
export class Child2waybindingComponent {
  name:string;

  constructor(){
    this.name="";
  }
  

}
