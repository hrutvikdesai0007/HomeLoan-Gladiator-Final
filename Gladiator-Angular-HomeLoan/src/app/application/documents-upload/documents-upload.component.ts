import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Debtor } from 'src/app/debtor';
import { DocumentDetails } from 'src/app/documentDetails';
import { FileUploadService } from 'src/app/file-upload.service';
import { LoanDetails2 } from 'src/app/loandetails2';
import { LoanTracker } from 'src/app/LoanTracker';
import { FilesArrayService } from 'src/app/services/files-array-service.service';
import { TestpostService } from 'src/app/testpost.service';
import { UserIncomeDetails3 } from 'src/app/userincomedetails3';
import { UserIncomeDetails4 } from 'src/app/userincomedetails4';
import { UserPersonalDetails } from 'src/app/userPersonalDetails';

@Component({
  selector: 'app-documents-upload',
  templateUrl: './documents-upload.component.html',
  styleUrls: ['./documents-upload.component.css'],
})
export class DocumentsUploadComponent implements OnInit {
  obj1: DocumentDetails = new DocumentDetails();
  a:UserIncomeDetails3[]=[];
  b:LoanDetails2[]=[];
  c: LoanTracker = new LoanTracker();
  //savObj1: SavingsAccount=new SavingsAccount();
  shortLink: string = '';
  shortLink1: string = '';
  shortLink2: string = '';
  shortLink3: string = '';
  shortLink4: string = '';
  shortLink5: string = '';
  shortLink6: string = '';
  shortLink7: string = '';
  loading: boolean = false; // Flag variable
  loading1: boolean = false; // Flag variable
  loading2: boolean = false; // Flag variable
  loading3: boolean = false; // Flag variable
  loading4: boolean = false; // Flag variable
  loading5: boolean = false; // Flag variable
  loading6: boolean = false; // Flag variable
  loading7: boolean = false; // Flag variable
  file: File;
  file1: File;
  file2: File;
  file3: File;
  file4: File;
  file5: File;
  file6: File;
  file7: File;
  constructor(
    private fileUploadService: FileUploadService,
    private router: Router,private testpostService: TestpostService
  ) {}
  ngOnInit(): void {}
  onChange(fileInputEvent: any) {
    this.file = fileInputEvent.target.files[0];
  }
  onChange1(fileInputEvent: any) {
    this.file1 = fileInputEvent.target.files[0];
  }
  onChange2(fileInputEvent: any) {
    this.file2 = fileInputEvent.target.files[0];
  }
  onChange3(fileInputEvent: any) {
    this.file3 = fileInputEvent.target.files[0];
  }
  onChange4(fileInputEvent: any) {
    this.file4 = fileInputEvent.target.files[0];
  }
  onChange5(fileInputEvent: any) {
    this.file5 = fileInputEvent.target.files[0];
  }

  onChange6(fileInputEvent: any) {
    this.file6 = fileInputEvent.target.files[0];
  }
  onChange7(fileInputEvent: any) {
    this.file7 = fileInputEvent.target.files[0];
  }
  // OnClick of button Upload
  onUpload() {
    this.loading = !this.loading;
    console.log(this.file);
    this.fileUploadService.upload(this.file).subscribe((event: any) => {
      if (typeof event === 'object') {
        // Short link via api response
        this.shortLink = event.link;
        this.loading = false; // Flag variable
        this.obj1.uploadAadhar = event.link;
      }
    });
  }
  onUpload1() {
    this.loading1 = !this.loading1;
    console.log(this.file1);
    this.fileUploadService.upload(this.file1).subscribe((event: any) => {
      if (typeof event === 'object') {
        // Short link via api response
        this.shortLink1 = event.link;
        this.loading1 = false; // Flag variable
        this.obj1.uploadVoter = event.link;
      }
    });
  }
  onUpload2() {
    this.loading2 = !this.loading2;
    console.log(this.file2);
    this.fileUploadService.upload(this.file2).subscribe((event: any) => {
      if (typeof event === 'object') {
        // Short link via api response
        this.shortLink2 = event.link;
        this.loading2 = false; // Flag variable
        this.obj1.UPLOADPAN = event.link;
      }
    });
  }
  onUpload3() {
    this.loading3 = !this.loading3;
    console.log(this.file3);
    this.fileUploadService.upload(this.file3).subscribe((event: any) => {
      if (typeof event === 'object') {
        // Short link via api response
        this.shortLink3 = event.link;
        this.loading3= false; // Flag variable
        this.obj1.uploadSalaryslip = event.link;
      }
    });
  }
  onUpload4() {
    this.loading4 = !this.loading4;
    console.log(this.file4);
    this.fileUploadService.upload(this.file4).subscribe((event: any) => {
      if (typeof event === 'object') {
        // Short link via api response
        this.shortLink4 = event.link;
        this.loading4 = false; // Flag variable
        this.obj1.uploadLoa = event.link;
      }
    });
  }
  onUpload5() {
    this.loading5 = !this.loading5;
    console.log(this.file5);
    this.fileUploadService.upload(this.file5).subscribe((event: any) => {
      if (typeof event === 'object') {
        // Short link via api response
        this.shortLink5 = event.link;
        this.loading5 = false; // Flag variable
        this.obj1.uploadNoc = event.link;
      }
    });
  }
  onUpload6() {
    this.loading6 = !this.loading6;
    console.log(this.file6);
    this.fileUploadService.upload(this.file6).subscribe((event: any) => {
      if (typeof event === 'object') {
        // Short link via api response
        this.shortLink6 = event.link;
        this.loading6 = false; // Flag variable
        this.obj1.uploadSaleagreement = event.link;
      }
    });
  }
//   onUpload7() {
//     this.loading7 = !this.loading7;
//     console.log(this.file7);
//     this.fileUploadService.upload(this.file7).subscribe((event: any) => {
//       if (typeof event === 'object') {
//         // Short link via api response
//         this.shortLink7 = event.link;
//         this.loading7 = false; // Flag variable
//         this.obj1.debtorAadhar = event.link;
//       }
//     });
//   }

  submitted1: boolean = false;
  userModeler = new Debtor();
  userModeler2 = new Debtor();
  // = new Debtor();
  loaner=new LoanDetails2();
  propty=new UserIncomeDetails3();
  
  onSubmit() {
    alert("Application done successfully!!!")
    this.userModeler.docs=this.obj1;
    // this.userModeler.propertiess=this.userModel;
    var x = JSON.stringify(this.obj1);
    console.log('hi there form 5' + x);
    localStorage.setItem('documents', x);
    console.log(this.obj1);
    this.submitted1 = true;
    var user = localStorage.getItem('property');
    var user2 = localStorage.getItem('income');
    var user3 = localStorage.getItem('loan');
    var user4 = localStorage.getItem('userdetails');
    
   
    if (typeof user === 'string') {
        user = JSON.parse(user);
        //this.userModeler.propertiess = 
        this.propty= Object.assign(new UserIncomeDetails3(), user);
        this.a.push(this.propty);
        console.log(this.a);
        this.userModeler.propertiess=this.a;
        
       console.log("finale1"+JSON.stringify(this.userModeler));
      
       // json.:26;
      }
      if (typeof user2 === 'string') {
        user2 = JSON.parse(user2);
        //this.userModeler.propertiess = 
        this.userModeler.employments = Object.assign(new UserIncomeDetails4(), user2);
        
       console.log("finale2"+JSON.stringify(this.userModeler));
      }
      
      if (typeof user4 === 'string') {
        user4 = JSON.parse(user4);
        this.userModeler2 = Object.assign(new Debtor(), user4);
        this.userModeler.debtorFName=this.userModeler2.debtorFName;
        this.userModeler.debtorMName=this.userModeler2.debtorMName;
        this.userModeler.debtorLName=this.userModeler2.debtorLName;
        this.userModeler.debtorAddress=this.userModeler2.debtorAddress;
        this.userModeler.debtorEmail=this.userModeler2.debtorEmail;
        this.userModeler.debtorPassword=this.userModeler2.debtorPassword;
        this.userModeler.debtorConfirmPass=this.userModeler2.debtorConfirmPass;
        this.userModeler.debtorPhone=this.userModeler2.debtorPhone;
        this.userModeler.debtorDOB=this.userModeler2.debtorDOB;
        this.userModeler.debtorGender=this.userModeler2.debtorGender;
        this.userModeler.debtorNationality=this.userModeler2.debtorNationality;
        this.userModeler.debtorAadhar=this.userModeler2.debtorAadhar;
        this.userModeler.debtorPancard=this.userModeler2.debtorPancard;
        this.c.verificationStatus='Pending';
        this.c.debtorPhone=this.userModeler2.debtorPhone;
        console.log("finale4"+JSON.stringify(this.userModeler));
      }
      if (typeof user3 === 'string') {
        user3 = JSON.parse(user3);
        this.loaner= Object.assign(new LoanDetails2(), user3);
        this.loaner.loanTrackers=this.c;
        this.b.push(this.loaner);
        console.log(this.b);
        this.userModeler.loanee=this.b;
        
        console.log("finale3"+JSON.stringify(this.userModeler));
      }
      console.log(user);
    alert('Sucessfully applied');
    console.log("finaleeeeeeeeeeeeeeeeeee"+JSON.stringify(this.userModeler));
    //localStorage.clear();
    
    this.testpostService.createUser(this.userModeler)
      .subscribe(data => console.log(data), error => console.log(error));

    this.router.navigate(['home']);
  }
}
