import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from 'src/app/Login';
import { LoginService } from 'src/app/login.service';

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export class UserDashboardComponent implements OnInit {

  user : Login[]=[];
  temp : any;
  status:boolean;
  view = true;

  constructor(private router : Router, private loginService : LoginService) {
    //this.router.navigate(['/loantracker']);
      
   }

  ngOnInit(): void {
    //this.gotoLoanTracker();
    if(sessionStorage.getItem("isLoggedIn") == "false"){
      this.router.navigate(["/User/Userlogin"]);
      alert("Please login first");
    }
  }

  viewUser(){
    this.view=!this.view;
    this.temp=sessionStorage.getItem("info");
     // console.log(this.temp)
     this.user=JSON.parse(this.temp);
      console.log(this.user);
     // console.log(this.user[0].debtorAadhar)
  }

  viewLoan(){
    this.temp=sessionStorage.getItem("info");
     // console.log(this.temp)
     this.user=JSON.parse(this.temp);
      console.log(this.user);
  }
  

  gotoLoanTracker(){
    console.log("Welcome to the loan tracking");
    //sessionStorage.setItem("userKey",JSON.stringify(this.user));
    sessionStorage.setItem("isLoggedIn","false");
    this.router.navigate(['/loantracker']);  
  }

  gotoLogin(){
    sessionStorage.setItem("isLoggedIn","false");
    this.router.navigate(['/User/Userlogin']);
    alert("Logged out successfully!!!");
   // this.user=false;
    //console.log(this.user);
  }

}
