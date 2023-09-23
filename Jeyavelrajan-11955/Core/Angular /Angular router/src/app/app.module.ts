import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { Routes, RouterModule, } from '@angular/router';

const ROUTES:Routes=[
  {path:'home',component: HomeComponent},
  {path:'Contact',component: ContactComponent},
  {path:'About',component: AboutComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(ROUTES),
    
  ],
  providers: [],
  bootstrap: [AppComponent]


})
export class AppModule { }
