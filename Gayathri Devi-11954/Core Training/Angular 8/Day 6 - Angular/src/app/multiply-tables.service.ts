import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MultiplyTablesService {

  getTable(a:number,b:number):number{
    return (a*b);
}
}

// getMultiplicationTable():number[][]{
//   const table1 : number [][] = [];
//   for(let i=1; i<=10;i++){
//     const row : number [] = [];
//     for(let j=1;j<=10;j++){
//       row.push(i*j);
//     }
//     table1.push(row);
//   }
//   return table1;
// }

// getMultiplication(number : number):number[]{
//   const tables : number[] = [];
//   for(let i = 1 ; i<=10;i++){
//     tables.push(number*i);
//   }
//   return tables;
// }
// }
