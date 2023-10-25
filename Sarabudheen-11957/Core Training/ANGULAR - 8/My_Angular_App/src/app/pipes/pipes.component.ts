import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {

  name :string = "Virat Kohli";
  date : Date = new Date();
  digit :number = 50024;

  arr1 : number[] = [8,4,6,2,9];
  arr2 : string[]= ['sara','virat','kohli'];

}
