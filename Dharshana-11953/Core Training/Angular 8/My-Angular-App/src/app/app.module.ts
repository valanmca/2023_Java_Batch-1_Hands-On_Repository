import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DirectivesComponent } from './directives/directives.component';
import { AssignfactComponent } from './assignfact/assignfact.component';
import { CalculatorService } from './calculator.service';
import { ServiceComponent } from './service/service.component';
import { FactorialService } from './factorial.service';
import { PipeComponent } from './pipe/pipe.component';
import { SortPipe } from './sort.pipe';
//import { TempFormComponent } from './temp-form/temp-form.component';
import { TempdrivformComponent } from './tempdrivform/tempdrivform.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { Assign4Component } from './assign4/assign4.component';
import { FruitsComponent } from './fruits/fruits.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { Assign2Component } from './assign2/assign2.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatCommonModule} from '@angular/material/core';
import {MatCardModule} from '@angular/material/card'
import {MatFormFieldModule} from '@angular/material/form-field'
import {MatInputModule} from '@angular/material/input'
import { MatGridListModule } from '@angular/material/grid-list';
import {MatIconModule} from '@angular/material/icon';
import { MatSelectModule } from '@angular/material/select';





@NgModule({
  declarations: [//specifying our components
    AppComponent, ChildComponent, DirectivesComponent, AssignfactComponent,ServiceComponent, PipeComponent, SortPipe,  TempdrivformComponent, ReactiveformComponent, Assign4Component, FruitsComponent, FirstComponent, SecondComponent, ThirdComponent, Assign2Component,   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserModule,
    AppRoutingModule,
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
    CalculatorService,FactorialService,SortPipe
  ],
  bootstrap: [AppComponent]//it specify our root component which is want to execute first
})
export class AppModule { }
