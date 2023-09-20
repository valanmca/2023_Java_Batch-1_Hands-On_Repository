import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sort'
})
export class SortPipe implements PipeTransform {

  transform(value: any[],args: string): any{
    if(args==='ascending'){
      return value.sort();
    }

    if(args==='descending'){
      return value.sort().reverse();
    }
    

    if(args==='reverse'){
      return value.reverse();
    }
    
  }

}
