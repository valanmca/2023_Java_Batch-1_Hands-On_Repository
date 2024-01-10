import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovieComponent } from './movie.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule, MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from '../app-routing.module';

/*describe('MovieComponent', () => {
  let component: MovieComponent;
  let fixture: ComponentFixture<MovieComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MovieComponent]
    });
    fixture = TestBed.createComponent(MovieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});*/

describe('Insert Component Test', () => {


  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MovieComponent],
      imports:[
        BrowserModule,
        AppRoutingModule,
        BrowserAnimationsModule,
        ReactiveFormsModule,
        HttpClientModule,
        MatToolbarModule,
        MatButtonModule,
        MatIconModule,
        MatDialogModule,
        MatFormFieldModule,
        MatInputModule,
        MatSelectModule,
        MatTableModule,
        MatSnackBarModule,
      ],
      providers: [
        
          { provide: MAT_DIALOG_DATA, useValue: {} },
          { provide: MatDialogRef, useValue: {} }
        
      ]
    }).compileComponents();
  });
  
  it('Insert Component Test', () => {
    const fixture = TestBed.createComponent(MovieComponent);
    const Employee = fixture.componentInstance;
    expect(Employee).toBeTruthy();
  });

  it('Insert Form GUI count', () => {
    const fixture = TestBed.createComponent(MovieComponent);
    const formElement = fixture.debugElement.nativeElement.querySelector("#movieForm");
    const inputElements = formElement.querySelectorAll("input");
    expect(inputElements.length).toEqual(4);
  });

  it('Testing Form valid', () => {
    const fixture = TestBed.createComponent(MovieComponent);
    const Movie = fixture.componentInstance;
    Movie.movieForm.controls?.['id'].setValue("108");
    Movie.movieForm.controls?.['name'].setValue("Annapoorani");
    Movie.movieForm.controls?.['type'].setValue("Drama");
    Movie.movieForm.controls?.['language'].setValue("Tamil");
    Movie.movieForm.controls?.['duration'].setValue("3hrs");
    expect(Movie.movieForm.valid).toBeTruthy();
  });
});

