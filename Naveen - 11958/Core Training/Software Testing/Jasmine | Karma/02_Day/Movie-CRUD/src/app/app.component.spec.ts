import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MAT_DIALOG_DATA, MatDialogModule, MatDialogRef } from '@angular/material/dialog';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MovieComponent } from './movie/movie.component';

/*describe('AppComponent', () => {
  beforeEach(() => TestBed.configureTestingModule({
    imports: [RouterTestingModule],
    declarations: [AppComponent]
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'MOVIE-CRUD'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('MOVIE-CRUD');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.content span')?.textContent).toContain('MOVIE-CRUD app is running!');
  });
});*/
describe('App Component Test', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AppComponent],
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
        MatSnackBarModule,MatPaginatorModule]
    }).compileComponents();
  });
  
  it('App Component Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

});
describe('Update Component Test', () => {

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
  
  it('Testing Component', () => {
    const fixture = TestBed.createComponent(MovieComponent);
    const Employee = fixture.componentInstance;
    expect(Employee).toBeTruthy();
  });

  it('Update Form GUI count', () => {
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

/*describe('Delete Component Test', () => {

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
  
  it('Testing Component', () => {
    const fixture = TestBed.createComponent(MovieComponent);
    const Movie = fixture.componentInstance;
    expect(Movie).toBeTruthy();
  });

  it('Testing Form valid', () => {
    const fixture = TestBed.createComponent(MovieComponent);
    const formElement = fixture.debugElement.nativeElement.querySelector(".cdk-overlay-container");
    const inputElement  = formElement.querySelectorAll("div");
    expect(inputElement).toEqual("Deleted Successfully")
  });


});*/



