import { Component } from '@angular/core';
import { DataService } from './data.service';
import { Movie } from './model/moviemodel';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Assessment-Project';

 
  
  movi: Movie;
  result:string="";
  movList:Movie[]=[];
  movieeList:Movie[]=[];
  flag:boolean=false;
MovieList: any;
  
  
  constructor(private service : DataService)
  {
    this.movi=new Movie();
    this.getAllDetails();
  }
  changeDiv(){
    this.flag=!this.flag;
  }


  insert(data:any)
  {
    this.movi.id=data.id;
    this.movi.name=data.name;
    this.movi.type=data.type;
    this.movi.depart=data.depart;
    this.movi.dur=data.dur;
    alert(this.result=this.service.insert(this.movi));
    this.getAllDetails();
    //this.myForm.reset();


  }
  update(data:any)
  {
    if(data.id == "" || data.name == "" || data.depart == "" || data.dur ==""){
      alert("All Fields must be enter");
    }
    
    else{
    this.movi.id=data.id;
    this.movi.name=data.name;
    this.movi.type=data.type;
    this.movi.depart=data.depart;
    this.movi.dur=data.dur;
    alert(this.result=this.service.update(this.movi));    
    this.getAllDetails();
  }

  }
  delete(data:any)
  {
    if(data.id == "" || data.name == "" || data.depart == "" || data.dur ==""){
      alert("All Fields must be enter");
    }
    else{
   
    this.movi.id=data.id;
    this.movi.name=data.name;
    this.movi.type=data.type;
    this.movi.depart=data.depart;
    this.movi.dur=data.dur;
    alert(this.result=this.service.delete(this.movi));    
    this.getAllDetails();
  }

  }

  
  getAllDetails()
  {
    this.service.getAlldetails().subscribe( ans=>this.movieeList=ans
    );


  }

}
