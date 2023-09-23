import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AngularComponent } from './angular/angular.component';
import { JavaScriptComponent } from './java-script/java-script.component';
import { EnrollService } from './enroll.service';

@NgModule({
  declarations: [
    AppComponent,
    AngularComponent,
    JavaScriptComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [EnrollService],
  bootstrap: [AppComponent]
})
export class AppModule { }
