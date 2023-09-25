import { Component } from '@angular/core';

@Component({
  selector: 'app-pipe-concept',
  templateUrl: './pipe-concept.component.html',
  styleUrls: ['./pipe-concept.component.css']
})
export class PipeConceptComponent {
name : string="domnic dev k";
date : Date=new Date();

arr1:number[]=[3,7,1,9,2];
arr2:string[]=["Domnic","Dev","hi","hello","wipro"];
}
