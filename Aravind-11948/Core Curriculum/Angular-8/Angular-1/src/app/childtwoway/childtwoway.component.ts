import { Component } from '@angular/core';

@Component({
  selector: 'app-childtwoway',
  templateUrl: './childtwoway.component.html',
  styleUrls: ['./childtwoway.component.css']
})
export class ChildtwowayComponent {
  name:string;
  constructor(){
    this.name="";
  }

}
