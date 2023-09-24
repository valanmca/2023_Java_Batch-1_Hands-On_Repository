import { Component } from '@angular/core';

@Component({
  selector: 'app-validationfrom',
  templateUrl:'./validationfrom.component.html',
  styleUrls: ['./validationfrom.component.css']
})

export class ValidationfromComponent {
  myFunction(data:any){
    alert(data.name+""+data.email+""+data.age+""+data.phone+""+data.counrty);
  }
}
