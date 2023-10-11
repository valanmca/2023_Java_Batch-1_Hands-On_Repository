import { Component } from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent {
  name : string = 'jenish immanuel raj j';
  date: Date = new Date();
  //Custom pipe
  arr1: number[] = [3,7,1,9,2];
  arr2: string[] = ['jenish', 'immanuel','raj', 'hi', 'relevantz'];


}
