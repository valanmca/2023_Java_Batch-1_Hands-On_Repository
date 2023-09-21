import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  info1: string[]=["Madhan",'11960','mk@gmail.com']
  info2: string[]=["Aravind",'11948','ad@gmail.com']
  info3: string[]=["Siva",'11947','sv@gmail.com']

  getInfo1(): string[]
  {
    return this.info1;
  }
  getInfo2(): string[]
  {
    return this.info2;
  }
  getInfo3(): string[]
  {
    return this.info3;
  }

  constructor() { }
}
