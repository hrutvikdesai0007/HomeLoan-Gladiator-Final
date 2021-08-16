import { LoanTracker } from "./LoanTracker";

export class LoanDetails2 {
        
        public debtorSalary : number;
        public loanAmount : number;
        public interestRate : number;
        public tenure: number;
        public loanTrackers: LoanTracker;
}
/*
Application_Id Number(4) NOT NULL,
DEBTORID NUMBER(4) NOT NULL,
debtorSalary NUMBER(12),
loanAmount NUMBER(12),
interestRate NUMBER(4),
tenure NUMBER(4),
*/
