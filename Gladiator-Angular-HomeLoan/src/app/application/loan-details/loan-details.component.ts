import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoanDetails } from 'src/app/loandetails';
import { LoanDetails2 } from 'src/app/loandetails2';
import { UserIncomeDetails2 } from 'src/app/userincomedetails2';

@Component({
  selector: 'app-loan-details',
  templateUrl: './loan-details.component.html',
  styleUrls: ['./loan-details.component.css']
})
export class LoanDetailsComponent implements OnInit {

  title = 'incomedetails1';
  loanModel = new LoanDetails2();
  organisationtypeHasError = true;
  submitted = false;
  errorMsg = '';
  list:String[] = ['IT','Manufacturing']

  validateTopic(value: string) {
    if (value === 'default') {
      this.organisationtypeHasError = true;
    } else {
      this.organisationtypeHasError = false;
    }
  }
  onSubmit() {
    var x=JSON.stringify(this.loanModel);
    console.log('hi there form 3'+x);
    localStorage.setItem('loan',x);
    this.submitted = true;
    alert("Form 3  Submitted Sucessfully");
    this.router.navigate(['application/personalDetails']);
  }
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

}
