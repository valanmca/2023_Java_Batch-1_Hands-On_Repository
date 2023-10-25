import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Employee } from './Model/Employee';

@Injectable({ providedIn : 'root'})
export class MyService {
    private url : string = "http://localhost:3004/posts";


    InsertEmployee(employee : Employee){
        this.http.post(this.url,employee).subscribe();
        return "Record Inserted";
    }

    UpdateEmployee(employee : Employee){
        this.http.put(this.url+"/"+employee.id,employee).subscribe();
        return "Record Updated";
    }

    DeleteEmployee(employee : Employee){
        this.http.delete(this.url+"/"+employee.id).subscribe();
        return "Record Deleted";
    }

    constructor(private http : HttpClient){ }

    getAllEmployeeDetails(){
        return this.http.get<Employee[]>(this.url);
    }

}
