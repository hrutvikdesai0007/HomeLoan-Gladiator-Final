import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { TestpostService } from '../testpost.service';
import { UserIncomeDetails1 } from '../userincomedetails1';
import { UserIncomeDetails3 } from '../userincomedetails3';

@Component({
  selector: 'app-testconnect',
  templateUrl: './testconnect.component.html',
  styleUrls: ['./testconnect.component.css']
})
export class TestconnectComponent implements OnInit {
 
  title = 'incomedetails1';
  userModel = new UserIncomeDetails3();
  topicHasError = true;
  submitted = false;
  errorMsg = '';

  validateTopic(value: string) {
    if (value === 'default') {
      this.topicHasError = true;
    } else {
      this.topicHasError = false;
    }
  }

  save(userForm: NgForm) {
    var object1 = [{
      key: 'abc',
      value: 1
    }];
    var object2 = [{
      key: 'cbd',
      value: 2
    }];
    
    // use the concat function to concatenate the arrays
    var object3 = object1.concat(object2);
    console.log('soln'+JSON.stringify(object3));
    var x=JSON.stringify(this.userModel)
    console.log('hi there'+x);
    localStorage.setItem('users',x); 
    console.log(this.userModel);
    this.testpostService.createUser(userForm.value)
      .subscribe(data => console.log(data), error => console.log(error));
    this.userModel =  new UserIncomeDetails3();
console.log("Successful");
  }

  onSubmit(userForm: NgForm) {


    this.submitted = true;
    alert("Form test Submitted Sucessfully");
    this.save(userForm);  
    console.log(JSON.stringify(this.userModel));
    localStorage.setItem('users',JSON.stringify(this.userModel)); 
  }
  constructor(private testpostService: TestpostService,private router:Router) { }


  ngOnInit(): void {
  }

}
export class abc{
  ai:number;
  obj:UserIncomeDetails3;
  }