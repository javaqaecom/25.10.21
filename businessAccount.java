public class businessAccount extends Account {
    //name balance accnumber
    //DATA
    public int companyId;
    public int creditLevel;
    public boolean isVIP;


    //func


    public businessAccount(double balance, String name, int accNumber, int companyId, int creditLevel, boolean isVIP) {
        super(balance, name, accNumber);
        this.companyId = companyId;
        this.creditLevel = creditLevel;
        this.isVIP = isVIP;
    }


    public void loan(StudentAccount studentacc,double loan){

        studentacc.deposit(loan);
        this.balance -= loan;
        creditLevel--;
    }

    @Override
    public String toString() {
        return "businessAccount{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", accNumber=" + accNumber +
                ", companyId=" + companyId +
                ", creditLevel=" + creditLevel +
                ", isVIP=" + isVIP +
                '}';
    }
}
