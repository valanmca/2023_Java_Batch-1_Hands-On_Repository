import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-forms-reactive',
  templateUrl: './forms-reactive.component.html',
  styleUrls: ['./forms-reactive.component.css']
})
export class FormsReactiveComponent {
  myForm: FormGroup;
  constructor() {
    this.myForm = new FormGroup(
      {
        name: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z][a-zA-Z]+')])

      }
    );
  }
    myFunction(data:any){
          alert(data.name)
    }
  
}
