import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {
  name:string='Sankarasathasivam';
  date:Date=new Date();

  arr1:number[]=[3,7,1,9,2];
  arr2:string[]=['sankar','shiva','Hello','Relevantz'];
}
