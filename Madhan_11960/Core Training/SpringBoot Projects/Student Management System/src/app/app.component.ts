import { Component } from '@angular/core';
import { Student } from './Model/Student';
import { StudentService } from './student.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Student-http';

  student : Student;
  result : string ="";
  stuList : Student[] = [];
  
  constructor(private service : StudentService)
  {
    this.student=new Student();
    this.getAllStudents();
  
  }
    form1={
      id:"",
      name:"",
      department:""
    }

    crud()
    {
      console.log(this.form1);
    }

    insertStudent(data:any)
    {
     this.student.id =data.id;
     this.student.name=data.name;
     this.student.department=data.department;

     this.result=this.service.insertStudent(this.student);

     this.getAllStudents(); //to update automatically by not reusing the code
    }

    updateStudent(data:any) 
    {
     this.student.id =data.id;
     this.student.name=data.name;
     this.student.department=data.department;

     this.result=this.service.updateStudent(this.student);

     this.getAllStudents(); //to update changes automatically by not reusing the code
    }

    deleteStudent(data:any)
    {
     this.student.id =data.id;
     this.student.name=data.name;
     this.student.department=data.department;

     this.result=this.service.deleteStudent(this.student);

     this.getAllStudents(); //to update automatically by not reusing the code
    }

    getAllStudents()
    {
      this.service.getAllStudentDetails().subscribe(students=> this.stuList = students);
    }
}

