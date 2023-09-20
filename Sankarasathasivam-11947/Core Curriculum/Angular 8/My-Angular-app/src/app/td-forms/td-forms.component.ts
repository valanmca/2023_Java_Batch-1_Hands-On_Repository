import { Component } from '@angular/core';

@Component({
  selector: 'app-td-forms',
  templateUrl: './td-forms.component.html',
  styleUrls: ['./td-forms.component.css']
})
export class TdFormsComponent {
  myFunction(data:any)
  {
    alert(data.name+""+data.email+""+data.age+""+data.phone+""+data.country+"");
  }

}
