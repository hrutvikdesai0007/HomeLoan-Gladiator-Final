import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from 'src/app/admin.service';
import { Debtor } from 'src/app/debtor';
import { DebtorService } from 'src/app/debtor.service';
import { LoanDetails2 } from 'src/app/loandetails2';
import { LoanTracker } from 'src/app/LoanTracker';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  allDebtors: Debtor[] = []; // gloal variable available to all other methods + html
  temporary : String;
 

  constructor(private debtorService: DebtorService, private adminService : AdminService, private router : Router) { }

  ngOnInit(): void {
    console.log('ngOnInit called....');
    console.log(this.adminService.isLoggedIn);
    if(sessionStorage.getItem("isLoggedinAdmin") == "false")
    {
      alert("Please Login First!!");
      this.router.navigate(["/Admin/Adminlogin"]);
    }
   
      this.loadAllDebtors();
    
  } //end of ngOnInit

  loadAllDebtors() {
    console.log('Load all debtors');
    this.debtorService.findAllDebtorService().subscribe(
      (data: Debtor[])=> 
      {
        this.allDebtors = data;
        //console.log(this.allDebtors[0].loanApplication.debtorSalary);
        console.log(this.allDebtors);
      }, 
      (err: any) => {
        console.log(err);
      }
    ); // invocation of the subscribe method
  }

  approve(value: LoanTracker, value1 : LoanDetails2){
    console.log("initial value" + this.adminService.isLoggedIn);
    value.balance = value1.loanAmount;
    alert("Loan Approved!");
    this.debtorService.updateTrackerServiceApprove(value).subscribe(
      (data: any)=> 
      {
        //console.log(this.allDebtors[0].loanApplication.debtorSalary);
        //console.log(data);
      }, 
      (err: any) => {
        //console.log(err);
      }
    ); // invocation of the subscribe method
    console.log("initial value" + this.adminService.isLoggedIn)

    location.reload();
  }

  reject(value: LoanTracker){
    alert("Loan Rejected!");
    this.debtorService.updateTrackerServiceReject(value).subscribe(
      (data: any)=> 
      {
        //console.log(this.allDebtors[0].loanApplication.debtorSalary);
        console.log(data);
      }, 
      (err: any) => {
        console.log(err);
      }
    ); // invocation of the subscribe method
    location.reload();
  }

loggedout(){
    alert("Successfully Logged Out!!");
    sessionStorage.setItem("isLoggedinAdmin","false");
    this.router.navigate(["/Admin/Adminlogin"]);
  }
}
