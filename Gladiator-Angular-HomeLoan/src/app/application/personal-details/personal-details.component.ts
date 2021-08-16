import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
import { UserPersonalDetails } from 'src/app/userPersonalDetails';
import { Debtor } from 'src/app/debtor';
@Component({
  selector: 'app-personal-details',
  templateUrl: './personal-details.component.html',
  styleUrls: ['./personal-details.component.css']
})
export class PersonalDetailsComponent implements OnInit {
  public today: Date = new Date();
  public currentDay: number = this.today.getDate();

  maxDate =  new Date(new Date().setDate(new Date().getDate()-1));
  submitted = false;
  errorMsg = '';
userdetails=new UserPersonalDetails();
userModel = new Debtor();
  regForm : FormGroup;
  firstnameControl : FormControl;
  middlenameControl : FormControl;
  lastnameControl : FormControl;
  addressControl : FormControl;
  emailControl : FormControl;
  passwordControl : FormControl;
  confirmpasswordControl : FormControl;
  nationalityControl : FormControl;
  anoControl : FormControl;
  pnoControl : FormControl;
  mobilenoControl : FormControl;
  genderControl : FormControl;
  dateControl : FormControl;
  submitted1 = false;
  constructor(formBuilder : FormBuilder,private router:Router) {
    this.firstnameControl = new FormControl("",Validators.compose([Validators.required,Validators.minLength(3), Validators.pattern("[a-zA-Z ]*")]));
    this.middlenameControl = new FormControl("",Validators.compose([Validators.required,Validators.minLength(3), Validators.pattern("[a-zA-Z ]*")]));
  this.lastnameControl = new FormControl("",Validators.compose([Validators.required,Validators.minLength(3), Validators.pattern("[a-zA-Z ]*")]));
  this.addressControl = new FormControl("")
  this.emailControl = new FormControl("",Validators.compose([Validators.required,Validators.pattern("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}$")]));
  this.passwordControl = new FormControl("",Validators.compose([Validators.required,Validators.minLength(6)]));
  this.confirmpasswordControl = new FormControl("",Validators.required);
  this.nationalityControl = new FormControl("",Validators.compose([Validators.required,Validators.minLength(3), Validators.pattern("[a-zA-Z ]*")]));
  this.anoControl = new FormControl("",Validators.compose([Validators.required,Validators.maxLength(12),Validators.minLength(12), Validators.pattern("^((\\+91-?)|0)?[0-9]{12}$")]));
  this.pnoControl = new FormControl("",Validators.compose([Validators.required,Validators.maxLength(10),Validators.minLength(10),Validators.pattern("[A-Za-z0-9]*")]));
  this.mobilenoControl = new FormControl("",[Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]);
  this.dateControl = new FormControl("");
  this.genderControl = new FormControl("",Validators.required);
  this.regForm = new FormGroup({
    firstName: new FormControl()
  });

   }
   ngOnInit(): void {
  }
  onSubmit() {
    var x=JSON.stringify(this.userdetails)
    console.log('hi there form 4'+x);
    localStorage.setItem('userdetails',x); 
    console.log(this.userdetails);
    this.submitted1 = true;
    alert("Form 4 Submitted Sucessfully");
    this.router.navigate(['application/documentsUploadDetails']);
  }
}
