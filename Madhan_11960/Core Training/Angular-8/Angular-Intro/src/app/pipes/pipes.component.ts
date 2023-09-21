import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {
    name : string ="Madhan";
    date : Date =new Date();

    arr1: number[]=[3,7,0,8,2,5];
    arr2: string[]=['madhan','kumar','aravind','siva','puli'];
}
