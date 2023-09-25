import { Component } from '@angular/core';

@Component({
  selector: 'app-atb-dir',
  templateUrl: './atb-dir.component.html',
  styleUrls: ['./atb-dir.component.css']
})
export class AtbDirComponent {

  Style_heading: string;
  Style_Class: string;

  constructor() {
    this.Style_heading = "red";
    this.Style_Class = "class_01"
  }
  change() {
    if (this.Style_heading == "green" && this.Style_Class == "class_01") {
      this.Style_heading = "red";
      this.Style_Class = "class_02";
    }
    else {
      this.Style_heading = "green";
      this.Style_Class = "class_01";
    }

  }



}
