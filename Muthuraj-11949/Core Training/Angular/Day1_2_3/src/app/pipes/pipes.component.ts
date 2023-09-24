import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {
  name:string ="Muthu raj";
  date: Date = new Date();
  arr1:number[]=[3,7,1,3,4];
  arr2: string[] =['Muthu','Raj','Hi','Hello','Relevantz']

}
