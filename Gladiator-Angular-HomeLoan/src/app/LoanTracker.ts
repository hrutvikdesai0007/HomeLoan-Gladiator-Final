// private int trackerId;

// @OneToOne
// @JoinColumn(name = "APPLICATIONID")
// private Loan loaneees;

// @Column(name = "DEBTORPHONE")
// private String debtorPhone;

// @Column(name = "VERIFICATIONSTATUS")
// private String verificationStatus;

// @Column(name = "FINALAPPROVAL")
// private String finalApproval;

// @Column(name = "REMARK")
// private String remark;

// @Column(name = "ACCOUNTNUM")
// private String accountNum;

// @Column(name = "BALANCE")
// private int balance;

export class LoanTracker {
    
    public debtorPhone : String;
    public verificationStatus : String;
    public finalApproval : String;
    public remark: String;
    public accountNum: number;
    public balance: number;
}
