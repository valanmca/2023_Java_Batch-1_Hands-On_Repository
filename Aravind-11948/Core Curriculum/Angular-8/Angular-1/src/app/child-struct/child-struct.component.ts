import { Component } from '@angular/core';

@Component({
  selector: 'app-child-struct',
  templateUrl: './child-struct.component.html',
  styleUrls: ['./child-struct.component.css']
})
export class ChildStructComponent {
  flag:boolean;
  constructor(){
    this.flag=true;
  }
   
  Changeflag(){
    this.flag=! this.flag;
  }
}
