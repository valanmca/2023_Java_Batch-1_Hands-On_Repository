import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildPropertyComponent } from './child-property/child-property.component';
import { ChildEventComponent } from './child-event/child-event.component';
import { ChildtwowayComponent } from './childtwoway/childtwoway.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ChildStructComponent } from './child-struct/child-struct.component';
import { FactorialComponent } from './factorial/factorial.component';
import { ChildAttributeComponent } from './child-attribute/child-attribute.component';
import { ChildEmpInfoComponent } from './child-emp-info/child-emp-info.component';
import { FormComponent } from './form/form.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';


@NgModule({
  declarations: [
    AppComponent,
    ChildPropertyComponent,
    ChildEventComponent,
    ChildtwowayComponent,
    ChildStructComponent,
    FactorialComponent,
    ChildAttributeComponent,
    ChildEmpInfoComponent,
    FormComponent,
    ReactiveformComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
