import { Component } from '@angular/core';

@Component({
  selector: 'app-propertybind',
  templateUrl: './propertybind.component.html',
  styleUrls: ['./propertybind.component.css']
})
export class PropertybindComponent {

    
    imagepath: string;
    width : number;
    height: number;
    constructor(){
      this.imagepath = "./assets/Angular.png"
      this.width = 70;
      this.height = 70;
    }

    getAddition(a:number, b: number):number{
      let Sum = a + b;
      return Sum;
    }
}
