export class UserPersonalDetails {

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

}

// DEBTORID NUMBER(4) NOT NULL,
// DEBTOR_FNAME VARCHAR2(15) NOT NULL,
// DEBTOR_MNAME VARCHAR2(15),
// DEBTOR_LNAME VARCHAR2(15) ,
// DEBTOR_ADDRESS VARCHAR2(75),
// DEBTOR_EMAIL VARCHAR2(25) NOT NULL UNIQUE,
// DEBTOR_PASSWORD VARCHAR2(14) NOT NULL,
// DEBTOR_CONFIRMPASS VARCHAR2(14) NOT NULL,
// DEBTOR_PHONE VARCHAR2(13) NOT NULL UNIQUE,
// DEBTOR_DOB DATE NOT NULL,
// DEBTOR_GENDER CHAR NOT NULL,
// DEBTOR_NATIONALITY VARCHAR2(15) NOT NULL,
// DEBTOR_AADHAR VARCHAR2(12) NOT NULL UNIQUE,
// DEBTOR_PANCARD VARCHAR2(10) NOT NULL UNIQUE