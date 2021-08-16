import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Debtor } from 'src/app/debtor';
import { UserIncomeDetails3 } from 'src/app/userincomedetails3';

@Component({
  selector: 'app-property',
  templateUrl: './property.component.html',
  styleUrls: ['./property.component.css']
})
export class PropertyComponent implements OnInit {

  title = 'incomedetails1';
  userModel = new UserIncomeDetails3();
  topicHasError = true;
  submitted = false;
  errorMsg = '';
  userModeler = new Debtor();
  validateTopic(value: string) {
    if (value === 'default') {
      this.topicHasError = true;
    } else {
      this.topicHasError = false;
    }
  }
  onSubmit() {
    //this.userModeler.propertiess=this.userModel;
    var x=JSON.stringify(this.userModel)
    console.log('hi there form 1'+x);
    localStorage.setItem('property',x);
    this.submitted = true;
    alert("Form 1 Submitted Sucessfully");
    this.router.navigate(['application/incomeDetails']);
  }
  home()
  {
    this.router.navigate(['/home']);
  }
  constructor(private router:Router) { }

  ngOnInit(): void {
  }
}
