import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserIncomeDetails3 } from './userincomedetails3';

@Injectable({
  providedIn: 'root'
})
export class TestpostService {
 // private baseUrl  ='http://localhost:8085/income/addInc/';//Spring's Employee JPA Controller
 private baseUrl  ='http://localhost:8090/debtor/addDebtor/';
  constructor(private myhttp:HttpClient) { }
  createUser(Debtor:Object) : Observable<Object>{
    console.log(Debtor);
    return this.myhttp.post(`${this.baseUrl}`, Debtor);
  }
  // createUser(userIncomeDetails3:Object) : Observable<Object>{
  //   console.log(userIncomeDetails3);
  //   return this.myhttp.post(`${this.baseUrl}`, userIncomeDetails3);
  // }
  
}
