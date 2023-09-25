import { Component } from '@angular/core';

@Component({
  selector: 'app-child-four',
  templateUrl: './child-four.component.html',
  styleUrls: ['./child-four.component.css']
})
export class ChildFourComponent {

  empid: number;
  empname: string;
  empsalary: number;

  MyName: string = "";
  Logo: string;
  img_width: number;
  img_height: number;

  constructor() {
    this.empid = 101;
    this.empname = "mahesh";
    this.empsalary = 15000;
    this.Logo = 'https://angular.io/assets/images/logos/angularjs/AngularJS-Shield.svg';
    this.img_height = 200;
    this.img_width = 200;
  }


  changeUserId() {
    this.empid = 111;
  }
  changeUserName() {
    this.empname = "Mahesh kumar"
  }
  changeUserSalary() {
    this.empsalary = 20000;
  }

  changeImg() {

    if (this.Logo == 'https://angular.io/assets/images/logos/angularjs/AngularJS-Shield.svg') {
      this.Logo = 'https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Angular_full_color_logo.svg/512px-Angular_full_color_logo.svg.png';
    }
    else {
      this.Logo = 'https://angular.io/assets/images/logos/angularjs/AngularJS-Shield.svg';
    }
  }
}

