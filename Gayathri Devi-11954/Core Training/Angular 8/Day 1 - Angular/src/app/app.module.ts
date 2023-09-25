import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { SecondchildComponent } from './secondchild/secondchild.component';

@NgModule({
  declarations: [     //you are decalring all component
    AppComponent, ChildComponent, SecondchildComponent      //App component load first
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
