Drop table Debtor cascade constraints;
Drop table EMPLOYMENT cascade constraints;
Drop table PROPERTY cascade constraints;
Drop table LOAN cascade constraints;
Drop table LOANTRACKER cascade constraints;
Drop table DOCS cascade constraints;

CREATE TABLE DEBTOR(
DEBTORID INTEGER,
DEBTORFNAME VARCHAR(15) ,
DEBTORMNAME VARCHAR(15),
DEBTORLNAME VARCHAR(15) ,
DEBTORADDRESS VARCHAR(75),
DEBTOREMAIL VARCHAR(25),
DEBTORPASSWORD VARCHAR(14) NOT NULL,
DEBTORCONFIRMPASS VARCHAR(14) NOT NULL,
DEBTORPHONE VARCHAR(13),
DEBTORDOB DATE NOT NULL,
DEBTORGENDER CHAR NOT NULL,
DEBTORNATIONALITY VARCHAR(15) NOT NULL,
DEBTORAADHAR VARCHAR(12) ,
DEBTORPANCARD VARCHAR(10),
CONSTRAINT DEBTOR_PRIMARY_KEY PRIMARY KEY (DEBTORID));


INSERT INTO DEBTOR VALUES(1,'SUNIL','ASHOK','AGARWAL','1-8-303/48/4 Gowtham Towers S P Road Hyderabad Andhra Pradesh','sa@gmail.com','ABCD1234','ABCD1234','+917506131167','1989-01-15','M','INDIAN',123456789123,'ALMPY0678');
INSERT INTO DEBTOR VALUES(2,'RAMESH','','MISHRA','144 Swadeshi Market Radha Galli Kalbadevi Mumbai Maharashtra','sm@gmail.com','ABCD5678','ABCD5678','+918080343467','1989-02-15','M','INDIAN',123452139123,'ABCDE1234');

CREATE TABLE EMPLOYMENT(
EMPLOYMENTID INTEGER,
DEBTORID INTEGER,
EMPLOYMENTTYPE VARCHAR(17),
RETIREMENTAGE INTEGER,
ORGANIZATIONTYPE VARCHAR(15),
CONSTRAINT EMPLOYMENT_PRIMARY_KEY PRIMARY KEY (EMPLOYMENTID),
CONSTRAINT EMPLOYMENT_FOREIGN_KEY FOREIGN KEY (DEBTORID) REFERENCES DEBTOR (DEBTORID));

INSERT INTO EMPLOYMENT VALUES(101,1,'SALARIED',66,'PRIVATE');
INSERT INTO EMPLOYMENT VALUES(102,2,'SELF EMPPLOYED',68,'PRIVATE');

CREATE TABLE PROPERTY(
PROPERTYID INTEGER,
DEBTORID INTEGER,
PROPERTYLOCATION VARCHAR(50),
PROPERTYNAME VARCHAR(50),
PROPERTYCOST INTEGER,
CONSTRAINT PROPERTY_PRIMARY_KEY PRIMARY KEY (PROPERTYID),
CONSTRAINT PROPERTY_FOREIGN_KEY FOREIGN KEY (DEBTORID) REFERENCES DEBTOR (DEBTORID));


INSERT INTO PROPERTY VALUES (11,1,'SANGLI','GREEN ESCAPES',600000);
INSERT INTO PROPERTY VALUES (12,2,'KOLHAPUR','DHARA COMPLEX',700000);

CREATE TABLE LOAN(
APPLICATIONID INTEGER,
DEBTORID INTEGER,
DEBTORSALARY INTEGER,
LOANAMOUNT INTEGER,
INTERESTRATE INTEGER,
TENURE INTEGER,
CONSTRAINT LOAN_PRIMARY_KEY PRIMARY KEY (APPLICATIONID),
CONSTRAINT LOAN_FOREIGN_KEY FOREIGN KEY (DEBTORID) REFERENCES DEBTOR (DEBTORID));

INSERT INTO LOAN VALUES (1,1,300000,600000,8,2);
INSERT INTO LOAN VALUES (2,2,500000,700000,8,3);


CREATE TABLE LOANTRACKER(
TRACKERID INTEGER,
APPLICATIONID INTEGER,
DEBTORPHONE VARCHAR(13),
VERIFICATIONSTATUS VARCHAR(20) DEFAULT 'PENDING',
FINALAPPROVAL VARCHAR(20),
REMARK VARCHAR(50),
ACCOUNTNUM VARCHAR(16),
BALANCE INTEGER,
CONSTRAINT LOANTRACKER_PRIMARY_KEY PRIMARY KEY (TRACKERID),
CONSTRAINT LOANTRACKER_FOREIGN_KEY FOREIGN KEY (APPLICATIONID) REFERENCES LOAN (APPLICATIONID));


INSERT INTO LOANTRACKER(TRACKERID,APPLICATIONID,DEBTORPHONE,FINALAPPROVAL,REMARK,ACCOUNTNUM,BALANCE) VALUES(21,1,'+917506131167','REJECTED','OVERCAPACITY',123112,500000);
INSERT INTO LOANTRACKER(TRACKERID,APPLICATIONID,DEBTORPHONE,VERIFICATIONSTATUS,FINALAPPROVAL,REMARK,ACCOUNTNUM,BALANCE) VALUES(22,2,'+917336131167','VERIFIED','REJECTED','PROPERTY ISSUE',122445,600000);




CREATE TABLE DOCS(
DOCID INTEGER,
DEBTORID INTEGER,
UPLOADAADHAR VARCHAR(90),
UPLOADVOTER VARCHAR(90),
UPLOADPAN VARCHAR(90),
UPLOADSALARYSLIP VARCHAR(90),
UPLOADLOA VARCHAR(90),
UPLOADNOC VARCHAR(90),
UPLOADSALEAGREEMENT VARCHAR(90),
CONSTRAINT DOCS_PRIMARY_KEY PRIMARY KEY (DOCID),
CONSTRAINT DOCS_FOREIGN_KEY FOREIGN KEY (DEBTORID) REFERENCES DEBTOR (DEBTORID));



INSERT INTO DOCS VALUES (1,1,'https://drive.google.com/file/d/1e5H0UM2ysJyxixpnXkylLtXTsLfQjIZe/view?usp=sharing','https://drive.google.com/file/d/1J_kGQ9bkTa8v5P8oU-RGcI3-5c2RdsVf/view?usp=sharing','https://drive.google.com/file/d/1TeSjpM75IjjU3nvXmgF_N99kvH-Cfmp4/view?usp=sharing','https://drive.google.com/file/d/1jEBNGsS4ykRM2UcEyY_19duPowDUq_Kj/view?usp=sharing','https://drive.google.com/file/d/1T2Ex7Dr4fNrE9NKw4WsIGCL7ZBH9ctI9/view?usp=sharing','https://drive.google.com/file/d/1tOg-V0t1cgBrwb6XA_LrbLi9aKHrHqsS/view?usp=sharing','https://drive.google.com/file/d/1MqcDHOoT9LDrmenVSpph3cYi6P38CJqg/view?usp=sharing');
INSERT INTO DOCS VALUES (2,2,'https://drive.google.com/file/d/1e5H0UM2ysJyxixpnXkylLtXTsLfQjIZe/view?usp=sharing','https://drive.google.com/file/d/1J_kGQ9bkTa8v5P8oU-RGcI3-5c2RdsVf/view?usp=sharing','https://drive.google.com/file/d/1TeSjpM75IjjU3nvXmgF_N99kvH-Cfmp4/view?usp=sharing','https://drive.google.com/file/d/1jEBNGsS4ykRM2UcEyY_19duPowDUq_Kj/view?usp=sharing','https://drive.google.com/file/d/1T2Ex7Dr4fNrE9NKw4WsIGCL7ZBH9ctI9/view?usp=sharing','https://drive.google.com/file/d/1tOg-V0t1cgBrwb6XA_LrbLi9aKHrHqsS/view?usp=sharing','https://drive.google.com/file/d/1MqcDHOoT9LDrmenVSpph3cYi6P38CJqg/view?usp=sharing');


CREATE TABLE Admin(
ADMINUSERNAME VARCHAR(20) NOT NULL,
ADMIN_FNAME VARCHAR(20) NOT NULL,
ADMIN_LNAME VARCHAR(20) NOT NULL,
ADMIN_PASSWORD VARCHAR(14),
CONSTRAINT ADMIN_PRIMARY_KEY PRIMARY KEY (ADMINUSERNAME));

INSERT INTO ADMIN VALUES('AAA','AA','BB','BBB');
