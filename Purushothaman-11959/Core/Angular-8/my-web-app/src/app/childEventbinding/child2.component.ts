import { Component } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrls: ['./child2.component.css']
})
export class Child2Component {
  empname:string;
  email:string;
  imagePath:string;
  width:number;
  height:number;
  

  constructor(){
    this.empname="Domnic";
    this.email="domnic@gmail.com";
    this.imagePath="https://www.searchenginejournal.com/wp-content/uploads/2019/04/the-seo-guide-to-angular.png";
    this.width=300;
    this.height=300;
    
  }
  changeName(){
    if(this.empname=="Domnic"){
      this.empname="Steve";
    }
    else{
      this.empname="Domnic";
    }
    
    
  }
  changeEmail(){
    if(this.email=="domnic@gmail.com"){
           this.email="steve07@gmail.com";
    }
    else{
      this.email="domnic@gmail.com";
    }
  }
  changeImage(){
    if(this.imagePath=="https://www.searchenginejournal.com/wp-content/uploads/2019/04/the-seo-guide-to-angular.png"){
    this.imagePath="https://bs-uploads.toptal.io/blackfish-uploads/components/blog_post_page/content/cover_image_file/cover_image/1275957/retina_1708x683_cover-top-18-most-common-angularjs-developer-mistakes-41f9ad303a51db70e4a5204e101e7414.png";
  }
  else{
    this.imagePath="https://www.searchenginejournal.com/wp-content/uploads/2019/04/the-seo-guide-to-angular.png";
  }
  }

}
