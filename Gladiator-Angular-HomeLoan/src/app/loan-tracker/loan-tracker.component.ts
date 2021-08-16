import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { LoanTracker1 } from '../LoanTracker1';
import { TrackerService } from '../tracker.service';

@Component({
  selector: 'app-loan-tracker',
  templateUrl: './loan-tracker.component.html',
  styleUrls: ['./loan-tracker.component.css']
})
export class LoanTrackerComponent implements OnInit {
  allLoans : LoanTracker1[]=[];
  tempLoans: LoanTracker1[]=[];
  trackerId : number;
  phone : String;
  constructor(private trackService : TrackerService) { }

  ngOnInit(): void {
    
    
  }

  /*loadAllLoans(){
    this.trackService.getAllLoansService().subscribe(
      (data:Tracker[])=>{
        this.allLoans=data;
        //this.tempLoans=data;
      },
      (err)=>{
        console.log(err);
      }
    );
  }

  updateLoanArray(){
    if(this.loanId==0 || this.phone==null){
      console.log('its zero ' + this.loanId + this.phone);
      //this.tempLoans = this.allLoans;
    }
    else{
      console.log('its not zero ' + this.loanId + this.phone);
      this.tempLoans = this.allLoans.filter(t=>(t.loanID==this.loanId));
      
    }
  }*/

  trackLoan(id:number, phoneno:String){
    this.trackService.getLoan(id,phoneno).subscribe((data:LoanTracker1[])=>{
      this.allLoans=data;
    this.tempLoans = this.allLoans.filter(t=>(t.trackerId==this.trackerId && t.debtorPhone==this.phone));
    console.log(this.allLoans.length);
    });
  }
}
