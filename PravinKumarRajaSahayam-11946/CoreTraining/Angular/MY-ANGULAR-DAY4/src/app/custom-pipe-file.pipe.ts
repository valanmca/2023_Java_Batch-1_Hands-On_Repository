import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'customPipeFile'
})
export class CustomPipeFilePipe implements PipeTransform {

  /*transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }*/
transform(value : any[] , args : string) : any
{
if(args === 'ascending')
{
  return value.sort();
}
if(args === 'descending')
{
  return value.sort().reverse();
}
if(args === 'reverse')
{
  return value.reverse();
}
}
}
