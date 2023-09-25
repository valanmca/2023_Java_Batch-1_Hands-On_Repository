import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { Assign4Component } from './assign4/assign4.component';
import { Assign3Component } from './assign3/assign3.component';
import { Assign2Component } from './assign2/assign2.component';
import { Assign5Component } from './assign5/assign5.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Assign1Component } from './assign1/assign1.component';

@NgModule({
  declarations: [
    AppComponent,
    Assign4Component,
    Assign3Component,
    Assign2Component,
    Assign5Component,
    Assign1Component
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
