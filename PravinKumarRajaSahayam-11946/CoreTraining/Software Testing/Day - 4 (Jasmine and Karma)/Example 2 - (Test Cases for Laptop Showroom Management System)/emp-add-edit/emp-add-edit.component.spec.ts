import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpAddEditComponent } from './emp-add-edit.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatNativeDateModule } from '@angular/material/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MAT_DIALOG_DATA, MatDialogModule, MatDialogRef } from '@angular/material/dialog';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatRadioModule } from '@angular/material/radio';
import { MatSelectModule } from '@angular/material/select';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatSortModule } from '@angular/material/sort';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from '../app-routing.module';
import { AppComponent } from '../app.component';
import { Laptop } from '../model/Laptop';

/*describe('EmpAddEditComponent', () => {
  let component: EmpAddEditComponent;
  let fixture: ComponentFixture<EmpAddEditComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EmpAddEditComponent]
    });
    fixture = TestBed.createComponent(EmpAddEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});*/
describe('Insert Component Test' , () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations : [AppComponent],
      imports : [
        BrowserModule,
        AppRoutingModule,
        BrowserAnimationsModule,
        MatToolbarModule,
        MatIconModule,
        MatButtonModule,
        MatDialogModule,
        MatFormFieldModule,
        MatInputModule,
        MatDatepickerModule,
        MatNativeDateModule,
        MatRadioModule,
        MatSelectModule,
        ReactiveFormsModule,
        HttpClientModule,
        MatTableModule,
        MatPaginatorModule,
        MatSortModule,
        MatSnackBarModule,
        MatCheckboxModule,
        MatCardModule, 
        MatCheckboxModule, 
        FormsModule,
       ],
        providers :
        [
{provide : MAT_DIALOG_DATA, useValue : {} },
{provide : MatDialogRef, useValue : {}}
        ]
    }).compileComponents();
  });
it('Employee Component Test' , () => {
  const fixture = TestBed.createComponent(EmpAddEditComponent);
  const laptop = fixture.componentInstance;
  expect(laptop).toBeTruthy();
});
it('Login Form GUI count for input fields' , () => 
{
  const fixture = TestBed.createComponent(EmpAddEditComponent);
  const formElement = fixture.debugElement.nativeElement.querySelector("#empForm");
  const inputElements = formElement.querySelectorAll("input");
  expect(inputElements.length).toEqual(4);
});
it('Login Form GUI count for button' , () => 
{
  const fixture = TestBed.createComponent(EmpAddEditComponent);
  const formElement = fixture.debugElement.nativeElement.querySelector("#empForm");
  const inputElements = formElement.querySelectorAll("button");
  expect(inputElements.length).toEqual(2);
});
it('Testing Form valid', () => {
  const fixture = TestBed.createComponent(EmpAddEditComponent);
  const laptop = fixture.componentInstance;
    laptop.empForm.controls?.['laptopId'].setValue("130");
    laptop.empForm.controls?.['laptopBrandName'].setValue("Dell");
    laptop.empForm.controls?.['laptopModelName'].setValue("Laptop");
    laptop.empForm.controls?.['laptopPrice'].setValue("1");
    expect(laptop.empForm.valid).toBeTruthy();
})
});