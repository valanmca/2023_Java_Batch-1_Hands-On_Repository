import { Component } from '@angular/core';
import { EnrollService } from '../enroll.service';

@Component({
  selector: 'app-java-script',
  templateUrl: './java-script.component.html',
  styleUrls: ['./java-script.component.css']
})
export class JavaScriptComponent {
  title = "Javascript";

  constructor(private enrollService: EnrollService){
    
  }

  OnEnroll(){  
    // const enrollService= new EnrollService();
    this.enrollService.onEnrollClicked(this.title);
  }

}
