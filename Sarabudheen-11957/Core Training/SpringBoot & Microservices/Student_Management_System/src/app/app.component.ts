import { Component } from '@angular/core';
import { Student } from './Model/Student';
import { StudentService } from './student.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'SMS_SpringBoot';
  student : Student;
  result :  string=" ";
  studentList : Student[] = [];

  constructor (private service : StudentService){
    this.student = new Student();
    this.getAllStudents();
  }
  InsertStudent(data : any){ 

    this.student.id= data.id;
    this.student.name = data.name;

    this.result=this.service.InsertStudent(this.student);

    this.getAllStudents();
  
  }

  UpdateStudent(data : any){ 

    this.student.id = data.id;
    this.student.name = data.name;

    this.result=this.service.UpdateStudent(this.student);

    this.getAllStudents();
  
  }

  DeleteStudent(data : any){ 

    this.student.id = data.id;
    this.student.name = data.name;

    this.result=this.service.DeleteStudent(this.student);

    this.getAllStudents();
  
  }



  getAllStudents(){
    this.service.getAllStudentDetails().subscribe(students=> this.studentList = students);
  }


}
