import { Component } from '@angular/core';
import { StudentInfoService } from './student-info.service';
import { Student } from './model/student';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'studentInfo';

  flag:boolean=true;
  flag1:boolean=false;
  

  student : Student;
  result : string="";
  stuList : Student[] = [];
  constructor(private service : StudentInfoService)
  {
    this.student=new Student();
    this.getAllStudents();
  }
  changediv()
  {
    this.flag=!this.flag;//view detail
  }
  changediv1()
  {
    this.flag1=!this.flag1; //adde mployee
  
  }

  insertStudent(data:any)
  {
    this.student.name=data.name;
    this.student.id=data.id;
    this.student.dep=data.dep;
    this.student.dob=data.dob;
    this.student.gender=data.gender;

    this.result=this.service.insertStudent(this.student);
    this.getAllStudents();
    
  }

  updateStudent(data:any)
  {
    this.student.name=data.name;
    this.student.id=data.id;
    this.student.dep=data.dep;
    this.student.dob=data.dob;
    this.student.gender=data.gender;

    this.result=this.service.updateStudent(this.student);
    this.getAllStudents();
    
  }

  deleteStudent(data:any)
  {
    this.student.name=data.name;
    this.student.id=data.id;
    this.student.dep=data.dep;
    this.student.dob=data.dob;
    this.student.gender=data.gender;

    this.result=this.service.deleteStudent(this.student);
    this.getAllStudents();
    
  }

  getAllStudents()
  {
    this.service.getAllStudentDetails().subscribe(students => this.stuList = students);
  }

}
