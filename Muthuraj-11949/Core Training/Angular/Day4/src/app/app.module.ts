import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { MedicalService } from './medical.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatNativeDateModule } from '@angular/material/core';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatRadioModule} from '@angular/material/radio';
import{MatSelectModule} from '@angular/material/select';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule, MatFormFieldModule, MatToolbarModule,MatInputModule,MatIconModule,MatButtonModule,MatNativeDateModule,ReactiveFormsModule,MatDatepickerModule,MatRadioModule,MatSelectModule,HttpClientModule,BrowserAnimationsModule
  ],
  providers: [MedicalService],
  bootstrap: [AppComponent]
})
export class AppModule { }
