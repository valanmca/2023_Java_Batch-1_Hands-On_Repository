import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent {
  image: string;
  width: number;
  height: number;

  constructor() {
    this.image = "./assets/RE.jpg";
    this.width = 400;
    this.height = 200;
  }

  changeimage() {
    if (this.image == "./assets/RE.jpg") {
      this.image = "https://www.iamabiker.com/wp-content/uploads/2022/07/Yamaha-MT-15-V2-HD-wallpaper-3.jpg"
    }
    else if (this.image == "https://www.iamabiker.com/wp-content/uploads/2022/07/Yamaha-MT-15-V2-HD-wallpaper-3.jpg") {
      this.image = "https://www.dodge.com/content/dam/fca-brands/na/dodge/en_us/wallpapers/desktop/2021/expanded/2021-dodge-wallpaper-challenger-03.jpg.image.1440.jpg"
    }
    else if (this.image == "https://www.dodge.com/content/dam/fca-brands/na/dodge/en_us/wallpapers/desktop/2021/expanded/2021-dodge-wallpaper-challenger-03.jpg.image.1440.jpg") {
      this.image = "./assets/RE.jpg";
    }

  }

}
