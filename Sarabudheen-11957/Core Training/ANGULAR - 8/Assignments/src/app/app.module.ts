import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Assignment4Component } from './assignment4/assignment4.component';
import { Assignment3Component } from './assignment3/assignment3.component';
import { Assignment2Component } from './assignment2/assignment2.component';

@NgModule({
  declarations: [
    AppComponent,
    Assignment4Component,
    Assignment3Component,
    Assignment2Component,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
