import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Debtor } from '../debtor';
import { UserIncomeDetails1 } from '../userincomedetails1';
import { UserIncomeDetails3 } from '../userincomedetails3';

@Component({
  selector: 'app-application',
  templateUrl: './application.component.html',
  styleUrls: ['./application.component.css']
})
export class ApplicationComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

}
