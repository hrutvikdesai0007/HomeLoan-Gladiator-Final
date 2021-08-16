import { Component, OnInit } from '@angular/core';
import { Debtor } from '../debtor';
import { UserIncomeDetails3 } from '../userincomedetails3';
import { UserPersonalDetails } from '../userPersonalDetails';

@Component({
  selector: 'app-application-form',
  templateUrl: './application-form.component.html',
  styleUrls: ['./application-form.component.css']
})
export class ApplicationFormComponent implements OnInit {
  //userModel = new UserIncomeDetails3();
  userdetails=new UserPersonalDetails();

  active = 1;
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
  next = ()=> {
    if(this.active < 3) this.active = this.active + 1; 
  }

  previous = ()=> {
    if(this.active > 1) this.active = this.active - 1; 
  }

  submit = () => {
    console.log(this.active);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
