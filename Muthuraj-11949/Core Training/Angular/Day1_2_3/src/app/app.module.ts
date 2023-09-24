import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule } from '@angular/forms';
import { RajComponent } from './raj/raj.component';
import { AttributeComponent } from './attribute/attribute.component';
import { AssignfactComponent } from './assignfact/assignfact.component';
import { MuthuService } from './muthu.service';
import { CalComponent } from './cal/cal.component';
import { muthu2Service } from './muthu2.service';
import { PipesComponent } from './pipes/pipes.component';
import { SortPipe } from './sort.pipe';
import { ValidationfromComponent } from './validationfrom/validationfrom.component';
import { ReactiveFromComponent } from './reactive-from/reactive-from.component';



@NgModule({

  declarations: [
    AppComponent,
    ChildComponent,
    RajComponent,
    AttributeComponent,
    AssignfactComponent,
    CalComponent,
    PipesComponent,
    SortPipe,
    ValidationfromComponent,
    ReactiveFromComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers:[
    MuthuService,
    muthu2Service
  ],
  bootstrap: [AppComponent]
})
export class AppModule { 
 }
