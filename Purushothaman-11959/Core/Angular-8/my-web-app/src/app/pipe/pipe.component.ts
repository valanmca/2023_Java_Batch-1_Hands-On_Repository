import { Component } from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent {
  name:string;
  date:Date;

  arr1:number[]=[8,2,4,3,9];
  arr2:string[]=['Santhosh','Akash','Prem','Guru'];

  constructor(){
    this.name="steve roggers";
    this.date=new Date();
  }

}
