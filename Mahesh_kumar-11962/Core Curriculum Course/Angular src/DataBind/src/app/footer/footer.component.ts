import { Component } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent {

  flag: boolean;
  vechicle: string[];

  constructor() {

    this.flag = true;

    this.vechicle = ['Two wheeler', 'Three wheeler', 'Four wheeler'];



  }
  changeFlag() {
    this.flag = !this.flag;
  }

  Vehicletype: string = "";

  info(wheeltype: string) {
    this.Vehicletype = wheeltype;
  }

}
