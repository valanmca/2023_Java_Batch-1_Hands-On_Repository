import { Component } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent {
  imgUrl="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRixhvGn5p9gIPEuQV7saHMDdLfmHzH6wkaBw&usqp=CAU";
  image:string;

  constructor(){
    this.image="./assets/RE.jpg";
  }
}
