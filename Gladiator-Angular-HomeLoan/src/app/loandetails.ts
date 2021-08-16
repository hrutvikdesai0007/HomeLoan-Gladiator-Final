export class LoanDetails {
    constructor(
        public maxloanAmountgrantable: number,
        public interestRate: number,
        public tenure: number,
        public loanAmount: number
    ) {}
}
/*
Application_Id Number(4) NOT NULL,
DEBTORID NUMBER(4) NOT NULL,
debtorSalary NUMBER(12),
loanAmount NUMBER(12),
interestRate NUMBER(4),
tenure NUMBER(4),
*/
