import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { compileDeclareNgModuleFromMetadata } from '@angular/compiler';
import { FormStyle } from '@angular/common';
import { MyappComponent } from './myapp/myapp.component';


@NgModule({
  declarations: [
    AppComponent,
    MyappComponent
    
   
        
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule  

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
