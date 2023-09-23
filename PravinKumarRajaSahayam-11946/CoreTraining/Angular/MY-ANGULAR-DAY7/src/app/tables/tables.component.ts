import { Component } from '@angular/core';

@Component({
  selector: 'app-tables',
  templateUrl: './tables.component.html',
  styleUrls: ['./tables.component.css']
})
export class TablesComponent {
employee: any;
  result : string = ""; 
  service: any;


insertEmployee(data : any)
{
  /*alert(date.id + " " +date.name + " " + date.salary+ " ");*/
  this.employee.id = data.id;
  this.employee.name = data.name;
  this.employee.salary = data.salary;


  this.result = this.service.insertEmployee(this.employee);

}

deleteEmployee(data : any)
{
  /*alert(date.id + " " +date.name + " " + date.salary+ " ");*/
  this.employee.id = data.id;
  this.employee.name = data.name;
  this.employee.salary = data.salary;


  this.result = this.service.insertEmployee(this.employee);

}

updateEmployee(data : any)
{
  /*alert(date.id + " " +date.name + " " + date.salary+ " ");*/
  this.employee.id = data.id;
  this.employee.name = data.name;
  this.employee.salary = data.salary;


  this.result = this.service.insertEmployee(this.employee);

}

/*updateEmployee(date : any)
{
  alert(date.name + " " + date.email + " " + date.age + " " + date.phonenumber + " " + date.country + " " );
}*/
/*deleteEmployee(date : any)
{
  alert(date.name + " " + date.email + " " + date.age + " " + date.phonenumber + " " + date.country + " " );
}*/
}
