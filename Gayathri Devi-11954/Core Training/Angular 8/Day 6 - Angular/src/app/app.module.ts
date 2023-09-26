import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { Assignment4ServicesComponent } from './assignment4-services/assignment4-services.component';
import { MultiplyTablesService } from './multiply-tables.service';


import { Assignment2FormsComponent } from './assignment2-forms/assignment2-forms.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {MatCommonModule} from '@angular/material/core';
import {MatCardModule} from '@angular/material/card'
import {MatFormFieldModule} from '@angular/material/form-field'
import {MatInputModule} from '@angular/material/input'
import { MatGridListModule } from '@angular/material/grid-list';
import {MatIconModule} from '@angular/material/icon';
import { MatSelectModule } from '@angular/material/select';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { Assignment3DIrectivesComponent } from './assignment3-directives/assignment3-directives.component';
import { Assignment1COmponentsFirstComponent } from './assignment1-components-first/assignment1-components-first.component';
import { Assignment1COmponentsSecondComponent } from './assignment1-components-second/assignment1-components-second.component';
import { Assignment1COmponentsThirdComponent } from './assignment1-components-third/assignment1-components-third.component';


@NgModule({
  declarations: [
    AppComponent,
    Assignment4ServicesComponent,
    Assignment2FormsComponent,
    Assignment3DIrectivesComponent,
    Assignment1COmponentsFirstComponent,
    Assignment1COmponentsSecondComponent,
    Assignment1COmponentsThirdComponent,
    
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule, 
    MatCommonModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    MatGridListModule,
    MatIconModule,
    MatSelectModule,
    FormsModule,
    ReactiveFormsModule

    
    
    
  ],
  providers: [
    MultiplyTablesService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
