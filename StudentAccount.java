public class StudentAccount extends Account{
    // name accnumber balance
    //Data
    public int year;
    public String creditCardNumber ;


    //fun


    public StudentAccount(double balance, String name, int accNumber, int year, String creditCardNumber) {
        super(balance,name,accNumber);
        this.year = year;
        this.creditCardNumber = creditCardNumber;
    }


    @Override
    public String toString() {
        return "StudentAccount{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", accNumber=" + accNumber +
                ", year=" + year +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                '}'+"בהצלחה בלימודים"
                ;
    }
}
