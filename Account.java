public class Account {
    //Data
    public double balance;
    public String name;
    public int accNumber;
    private String phonenumber;

    //fun

    //constructor

    //getter
    public String getPhoneNumber(){
        return this.phonenumber;
    }
    //setter
    public void setPhonenumber(String phonenumber){
        this.phonenumber=phonenumber;
    }

    public Account(double balance, String name, int accNumber) {
        this.balance = balance;
        this.name = name;
        this.accNumber = accNumber;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit( double amount){
        this.balance +=amount;
    }


    @Override
    public String toString() {
        return "Account{ Good evening ," + name+
                " ,balance=" + balance +"" + ", accNumber= ***"+(accNumber%1000)+"}";
    }
}
