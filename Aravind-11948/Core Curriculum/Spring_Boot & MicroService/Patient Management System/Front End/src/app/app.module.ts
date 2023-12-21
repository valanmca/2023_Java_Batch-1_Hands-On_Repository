import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';

import {MatFormFieldModule} from '@angular/material/form-field';

import {MatTabsModule} from '@angular/material/tabs';
import { MatInputModule } from '@angular/material/input';
import {MatTooltipModule} from '@angular/material/tooltip';




import {MatCardModule} from '@angular/material/card';






@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule, BrowserAnimationsModule ,MatToolbarModule,MatIconModule,MatButtonModule,MatInputModule,MatFormFieldModule,MatTabsModule,MatTooltipModule
    ,MatCardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

