import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {Routes, RouterModule, RouterOutlet, ROUTES } from '@angular/router';
import { TablesComponent } from './tables/tables.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { EmployeeserviceService } from './employeeservice.service';
import { HttpClientModule } from '@angular/common/http';
/*const ROUTES: Routes = [
  {path : 'Home' , component : HomeComponent},
  {path : 'Contact' , component : ContactComponent},
  {path : 'About' , component : AboutComponent}
];*/

@NgModule({
  declarations: [
    AppComponent,
    TablesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    /*RouterModule.forRoot(ROUTES),*/
    FormsModule,
    HttpClientModule
  ],
  providers: [EmployeeserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
