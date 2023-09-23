import { Component } from '@angular/core';
import { EnrollService } from '../enroll.service';

@Component({
  selector: 'app-angular',
  templateUrl: './angular.component.html',
  styleUrls: ['./angular.component.css']
})
export class AngularComponent {
    title="Angular";

    constructor(private enrollService : EnrollService){

    }

    OnEnroll(){
      // const enrollService = new EnrollService();
      this.enrollService.onEnrollClicked(this.title);
    }
}
