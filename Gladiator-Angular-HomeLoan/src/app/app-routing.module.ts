import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { RouterModule, Routes } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { EligibilityCalculatorComponent } from './calculator/eligibility-calculator/eligibility-calculator.component';
import { EmiCalculatorComponent } from './calculator/emi-calculator/emi-calculator.component';
import { FAQComponent } from './faq/faq.component';
import { LoanTrackerComponent } from './loan-tracker/loan-tracker.component';
import { ApplicationComponent } from './application/application.component';
import { LoanDetailsComponent } from './application/loan-details/loan-details.component';
import { IncomeDetailsComponent } from './application/income-details/income-details.component';
import { PersonalDetailsComponent } from './application/personal-details/personal-details.component';
import { DocumentsUploadComponent } from './application/documents-upload/documents-upload.component';
import { TestconnectComponent } from './testconnect/testconnect.component';
import { ApplicationFormComponent } from './application-form/application-form.component';
import { AdminComponent } from './admin/admin.component';
import { AdminLoginComponent } from './admin/admin-login/admin-login.component';
import { AdminDashboardComponent } from './admin/admin-dashboard/admin-dashboard.component';
import { UserComponent } from './user/user.component';
import { UserLoginComponent } from './user/user-login/user-login.component';
import { UserDashboardComponent } from './user/user-dashboard/user-dashboard.component';
import { FeaturesComponent } from './features/features.component';
import { DocumentsComponent } from './documents/documents.component';
import { PropertyComponent } from './application/property/property.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent},
  {path: 'features', component: FeaturesComponent },
  {path: 'documents', component: DocumentsComponent },
  {path: 'calculator', component: CalculatorComponent,
      children: [
        { path: 'EligibilityCalculator', component: EligibilityCalculatorComponent },
        { path: 'EmiCalculator', component: EmiCalculatorComponent }
    ]
  },
  { path: 'Admin', component: AdminComponent,
  children: [
    { path: 'Adminlogin', component: AdminLoginComponent}]},

{ path: 'Admindashboard', component: AdminDashboardComponent },
{ path: 'User', component: UserComponent,
  children: [
  { path: 'Userlogin', component: UserLoginComponent}
]},
{ path: 'Userdashboard', component: UserDashboardComponent},
{path: 'about', component: AboutUsComponent },
{path: 'calculator', component: CalculatorComponent,
    children: [
      { path: 'Eligibility Calculator', component: EligibilityCalculatorComponent },
      { path: 'Emi Calculator', component: EmiCalculatorComponent }
    ]},
  { path: 'LoanTrack', component: LoanTrackerComponent  },
  {path: 'application', component: ApplicationComponent,
children: [
  { path: 'propertyDetails', component: PropertyComponent},
  { path: 'incomeDetails', component: IncomeDetailsComponent},
  { path: 'loanDetails', component: LoanDetailsComponent },
  { path: 'personalDetails', component: PersonalDetailsComponent},
  { path: 'documentsUploadDetails', component: DocumentsUploadComponent},
]
},  
{ path: 'f1',component:ApplicationFormComponent},
{ path: 'test', component: TestconnectComponent},
{ path: 'loantracker', component: LoanTrackerComponent},
{ path: 'login', component: LoginComponent},
{ path: 'about', component: AboutUsComponent },
{ path: 'faq', component: FAQComponent},
{ path: '', redirectTo: '/home', pathMatch: 'full'},
{ path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
