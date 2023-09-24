import { Component } from '@angular/core';
import { TestMessage } from 'rxjs/internal/testing/TestMessage';

@Component({
  selector: 'app-raj',
  templateUrl: './raj.component.html',
  styleUrls: ['./raj.component.css']
})
export class RajComponent {

  flag : boolean;
  vehicles : string[];

constructor(){
    this.flag =true;
    this.vehicles =["Two wheeler,Three wheeler, Four wheeler"];

  

  }
  changeFlag() {
     this.flag= ! this.flag;
  }}