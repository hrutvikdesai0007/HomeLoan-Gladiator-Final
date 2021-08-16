import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from 'src/app/Login';
import { LoginService } from 'src/app/login.service';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  user : Login = new Login();
  debtor : Login[]=[];
  tempdebtor : Login[]=[];
  debtorid : number;
  password:string;
  notFound : String;
  constructor(private router: Router,private loginService : LoginService) { }
  ngOnInit(): void {
    sessionStorage.setItem("isLoggedIn","false");
  }
  login(id:number, pass:String){
    this.loginService.login(id,pass).subscribe((data:Login[])=>{
      this.debtor=data;
      this.tempdebtor = this.debtor.filter(d=>(d.debtorId==this.debtorid && this.password==this.password));
      //console.log(this.debtorid);
      //console.log(this.password);
      console.log(this.tempdebtor);
      if(this.tempdebtor.length==0){
        this.user.loginStatus=false;
       // console.log(this.user.loginStatus)
      }else{
        this.user.loginStatus=true;
        //console.log(this.user.loginStatus)
        this.gotoDashBoard();

      }
    });
  }

  gotoDashBoard() {
    console.log("Welcome to the dashboard after authentication...");
    //some service calls can be made to fetch more user details
    //sessionStorage.setItem("userKey",JSON.stringify(this.user.loginStatus));
    sessionStorage.setItem("info",JSON.stringify(this.tempdebtor));
    sessionStorage.setItem("isLoggedIn","true");
    this.router.navigate(['/Userdashboard']);  
    alert("Logged in successfully!!!");
  }

}
