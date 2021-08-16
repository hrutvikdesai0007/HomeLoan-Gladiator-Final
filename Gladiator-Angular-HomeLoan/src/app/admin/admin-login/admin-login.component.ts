import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Admin } from 'src/app/admin';
import { AdminService } from 'src/app/admin.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  constructor(private adminservice : AdminService, private router: Router) {
   }
   uname: String;
   pwd: String; 
  ngOnInit(): void {
    console.log('ngOnInit called....');
  }
  adminLogin(form: NgForm){
    console.log('Load the admin...');
    console.log(this.uname);
    this.adminservice.findAdminByUsernameService(this.uname,this.pwd).subscribe(
      (data: Admin[])=> 
      {
        if(data.length != 1){
          alert("Login Failed!!! Wrong Credentials!!!");
        }
        else{
          if(this.uname == data[0].adminUsername && this.pwd == data[0].adminPassword){
            sessionStorage.setItem("isLoggedinAdmin","true");
            alert("Login successfull!!!");
            this.router.navigate(["/Admindashboard"]);
            
          }
        }
      }, 
      (err: any) => {
        console.log(err);
      }
    ); // invocation of the subscribe method
    //this.router.navigate(["/Admindashboard"]);
  }
}
