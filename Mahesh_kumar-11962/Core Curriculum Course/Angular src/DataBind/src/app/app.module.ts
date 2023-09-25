import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildOneComponent } from './child-one/child-one.component';
import { ChildTwoComponent } from './child-two/child-two.component';
import { ChildThreeComponent } from './child-three/child-three.component';
import { ChildFourComponent } from './child-four/child-four.component';
import { FooterComponent } from './footer/footer.component';

import { FormsModule } from '@angular/forms';
import { AtbDirComponent } from './atb-dir/atb-dir.component';
import { AssignOneComponent } from './assign-one/assign-one.component';



@NgModule({
  declarations: [
    AppComponent,
    ChildOneComponent,
    ChildTwoComponent,
    ChildThreeComponent,
    ChildFourComponent,
    FooterComponent,
    AtbDirComponent,
    AssignOneComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
