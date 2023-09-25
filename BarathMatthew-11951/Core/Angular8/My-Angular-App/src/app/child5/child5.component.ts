import { Component } from '@angular/core';

@Component({
  selector: 'app-child5',
  templateUrl: './child5.component.html',
  styleUrls: ['./child5.component.css']
})
export class Child5Component {
    name:string = 'Barath Matthew';
    date:Date = new Date();
}
