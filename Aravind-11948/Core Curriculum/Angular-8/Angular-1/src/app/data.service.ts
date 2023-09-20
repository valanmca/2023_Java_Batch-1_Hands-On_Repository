import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  info1:string[]=["Aravind",'11948','jmc@gmail.com'];
  info2:string[]=["shiva",'11947','jmk@gmail.com'];
  info3:string[]=["mathan",'119680','jmj@gmail.com'];
  empid:number=1001;

  

  constructor() { }

  getInfo1():string[]{
    return this.info1;

  }

  getInfo2():string[]{
    return this.info2;

  }
  getInfo3():string[]{
    return this.info3;

  }
  getid():number{
    return this.empid;
  }

  getfactorial(a:number):number

  {
    let fact=1;
    for(let i=1;i<=a;i++)
    {
       fact=fact*i;
    }
    return fact;
  }
}
