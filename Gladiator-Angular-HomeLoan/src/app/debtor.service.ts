import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Debtor } from './debtor';
import { LoanTracker } from './LoanTracker';


@Injectable({
  providedIn: 'root'
})
export class DebtorService {
  baseUrl: string = "http://localhost:8090/admin/"

  constructor(private myhttp : HttpClient) { }

  findAllDebtorService() : Observable<Debtor[]>{
    console.log("Debtor service invoked....")
    return this.myhttp.get<Debtor[]>(this.baseUrl+"getAllDebtors");
  }

  updateTrackerServiceApprove(lt : LoanTracker) : Observable<any>{
    console.log("Approve Update Tracker Service is called...");
    return this.myhttp.put<any>(this.baseUrl+"updateLoanTrackerApprove",lt);
  }

  updateTrackerServiceReject(lt : LoanTracker) : Observable<any>{
    console.log("Reject Update Tracker Service is called...");
    return this.myhttp.put<any>(this.baseUrl+"updateLoanTrackerReject",lt);
  }

}
