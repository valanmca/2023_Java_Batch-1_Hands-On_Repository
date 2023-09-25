import { Component } from '@angular/core';

@Component({
  selector: 'app-pipe-concept',
  templateUrl: './pipe-concept.component.html',
  styleUrls: ['./pipe-concept.component.css']
})
export class PipeConceptComponent {

  Username :string ="mahesh kumar";
  date:Date = new Date();
arr1:number[] = [3,7,1,9,2];
arr2:string[] = ['mahesh','kumar','aravind','domnic','naga'];

}
