import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {
  name:string='aravind';
  date:Date=new Date();

  arr1:number[]=[1,7,4,9,3,2];
  arr2:string[]=['aravind','shiva','madhan','kumar'];

}
