import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Debtor } from 'src/app/debtor';
import { UserIncomeDetails2 } from 'src/app/userincomedetails2';
import { UserIncomeDetails4 } from 'src/app/userincomedetails4';

@Component({
  selector: 'app-income-details',
  templateUrl: './income-details.component.html',
  styleUrls: ['./income-details.component.css']
})
export class IncomeDetailsComponent implements OnInit {
  userModeler = new Debtor();
  title = 'incomedetails1';
  userModel = new UserIncomeDetails4();
  organisationtypeHasError = true;
  submitted = false;
  errorMsg = '';
  list:String[] = ['Private','Government']

  validateTopic(value: string) {
    if (value === 'default') {
      this.organisationtypeHasError = true;
    } else {
      this.organisationtypeHasError = false;
    }
  }
  onSubmit() {
    //this.userModeler.employments=this.userModel;
    console.log('hi there form 2'+ JSON.stringify(this.userModeler));
    var x=JSON.stringify(this.userModel)
    console.log('hi there form 2'+x);
    localStorage.setItem('income',x);
    alert("Form 2 Submitted Sucessfully");
    this.submitted = true;
    this.router.navigate(['application/loanDetails']);
  }
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

}
