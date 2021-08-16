import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eligibility-calculator',
  templateUrl: './eligibility-calculator.component.html',
  styleUrls: ['./eligibility-calculator.component.css']
})
export class EligibilityCalculatorComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  monthlyincome:number=0;
  public test=0;
   ngAfterViewInit(): void {
     this.update();
   }
   rupdate()
   {
    this.test=this.monthlyincome;
    this.update();
   }
   update(){
     console.log(this.monthlyincome);
     this.test=(this.monthlyincome*0.6)*60;
   }
}
