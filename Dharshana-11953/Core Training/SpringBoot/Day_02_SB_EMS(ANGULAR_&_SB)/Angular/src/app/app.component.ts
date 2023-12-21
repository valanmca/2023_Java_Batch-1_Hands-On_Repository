import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { EmpaddComponent } from './empadd/empadd.component';
import { EmpserviceService } from './empservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Employee';

  constructor(private dialog: MatDialog,private empservice : EmpserviceService){}

  ngOnInit(): void{
    this.getEmployeeList();
  }

  openAddEditEmpForm(){
    this.dialog.open(EmpaddComponent);
  }

  getEmployeeList(){
    this.empservice.getEmployeeList().subscribe({
      next:(res)=>{
        console.log(res);
      },
      error: console.log,
    }
    )
  }
}
