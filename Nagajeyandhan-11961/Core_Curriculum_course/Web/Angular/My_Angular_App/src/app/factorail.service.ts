import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorailService {

    getFact( a: number): number{
        let fact = 1,i;
        for(i=1;i<= a; i++){
          fact=fact*i;
        }
      return fact;
    }
}
