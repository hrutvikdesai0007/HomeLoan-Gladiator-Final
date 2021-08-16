import { DocumentDetails } from "./documentDetails";
import { LoanDetails2 } from "./loandetails2";
import { UserIncomeDetails3 } from "./userincomedetails3";
import { UserIncomeDetails4 } from "./userincomedetails4";
import { UserPersonalDetails } from "./userPersonalDetails";

export class Debtor{
    public debtorFName : string;
    public debtorMName : string;
    public debtorLName : string;
    public debtorAddress : string;
    public debtorEmail : string;
    public debtorPassword : string;
    public debtorConfirmPass : string;
    public debtorPhone  : string;
    public debtorDOB : Date;
    public debtorGender : string;
    public debtorNationality : string;
    public debtorAadhar : string;
    public debtorPancard : string;
    public docs: DocumentDetails;
    public loanee: LoanDetails2[];
    public propertiess: UserIncomeDetails3[];
    public employments: UserIncomeDetails4;
}