import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './home/home.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { ApplicationComponent } from './application/application.component';
import { LoginComponent } from './login/login.component';
import { FAQComponent } from './faq/faq.component';
import { FeaturesComponent } from './features/features.component';
import { EligibilityCalculatorComponent } from './calculator/eligibility-calculator/eligibility-calculator.component';
import { EmiCalculatorComponent } from './calculator/emi-calculator/emi-calculator.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { NgxSliderModule } from '@angular-slider/ngx-slider';
import { LoanTrackerComponent } from './loan-tracker/loan-tracker.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { HttpClientModule } from '@angular/common/http';
import { IncomeDetailsComponent } from './application/income-details/income-details.component';
import { LoanDetailsComponent } from './application/loan-details/loan-details.component';
import { PersonalDetailsComponent } from './application/personal-details/personal-details.component';
import { DocumentsUploadComponent } from './application/documents-upload/documents-upload.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TestconnectComponent } from './testconnect/testconnect.component';
import { ApplicationFormComponent } from './application-form/application-form.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CommonModule } from '@angular/common';
import { AdminLoginComponent } from './admin/admin-login/admin-login.component';
import { AdminDashboardComponent } from './admin/admin-dashboard/admin-dashboard.component';
import { UserLoginComponent } from './user/user-login/user-login.component';
import { UserDashboardComponent } from './user/user-dashboard/user-dashboard.component';
import { DocumentsComponent } from './documents/documents.component';
import { PropertyComponent } from './application/property/property.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutUsComponent,
    CalculatorComponent,
    ApplicationComponent,
    LoginComponent,
    FAQComponent,
    FeaturesComponent,
    EligibilityCalculatorComponent,
    EmiCalculatorComponent,
    PageNotFoundComponent,
    LoanTrackerComponent,
    AdminComponent,
    UserComponent,
    FeaturesComponent,
    IncomeDetailsComponent,
    LoanDetailsComponent,
    PersonalDetailsComponent,
    DocumentsUploadComponent,
    TestconnectComponent,
    ApplicationFormComponent,
    AdminLoginComponent,
    AdminDashboardComponent,
    UserLoginComponent,
    UserDashboardComponent,
    DocumentsComponent,
    PropertyComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    NgxSliderModule,
    BrowserAnimationsModule,
    HttpClientModule,
    NgbModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    CommonModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
