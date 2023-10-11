import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BuybookComponent } from './buybook/buybook.component';

const routes: Routes = [
  {path:'', component:BuybookComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
