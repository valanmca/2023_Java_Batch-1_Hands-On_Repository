import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent {
  Name: string;
  Mobileno: number;
  Address: string;

  constructor() {
    this.Name = "Aravind";
    this.Mobileno = 7089327651;
    this.Address = "Madurai";
  }

  changeName() {
    if (this.Name == "Aravind") {
      this.Name = "Madhan";
    } else {
      this.Name = "Aravind";
    }
  }
  changeMobileno() {
    if (this.Mobileno == 7089327651) {
      this.Mobileno = 8745230916;
    } else {
      this.Mobileno = 7089327651;
    }
  }
  changeAddress() {
    if (this.Address == "Madurai") {
      this.Address = "Virudhunagar";
    } else {
      this.Address = "Madurai";
    }
  }
}
