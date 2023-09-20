import { Component } from '@angular/core';

@Component({
  selector: 'app-child-twoway',
  templateUrl: './child-twoway.component.html',
  styleUrls: ['./child-twoway.component.css']
})
export class ChildTwowayComponent {
  name:string;
  constructor(){
    this.name="";
  }

}
