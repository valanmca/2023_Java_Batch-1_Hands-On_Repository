import { Component } from '@angular/core';

@Component({
  selector: 'app-child5',
  templateUrl: './child5.component.html',
  styleUrls: ['./child5.component.css']
})
export class Child5Component {
name: string ='jeyavelrajan';
date:Date = new Date();

arr1: number[] = [3,7,1,9,2];
arr2: string[] = ['jeyavelrajan','Selvaraj','hi','hello','from','relevantz'];

}
