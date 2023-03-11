import org.w3c.dom.ls.LSOutput;

//BankAccount interface and checking and savings classes:
//Create an interface called BankAccount that has three abstract methods:
//getBalance(), deposit(), and withdraw(). Then create two classes called
//CheckingAccount and SavingsAccount that implement the BankAccount
//interface. The CheckingAccount class should have an instance variable for the
//account's overdraft limit, and the SavingsAccount class should have an instance
//variable for the account's interest rate. Implement the getBalance(), deposit(),
//and withdraw() methods for each.
interface BankAccount7{
    void getBalenced();
    void deposite();
    void withdrawn();
}
class checkingAccount2 implements BankAccount7{
    public int overdraftLimit;
    @Override
    public void getBalenced() {
        System.out.println("get balenced");
    }

    @Override
    public void deposite() {
        System.out.println("deposite");
    }

    @Override
    public void withdrawn() {
        System.out.println("withrawn money");
    }

}
class SavingAccount1 implements BankAccount7{
    public int interest_rate;
    @Override
    public void getBalenced() {
        System.out.println("balenced check");
    }

    @Override
    public void deposite() {
        System.out.println(" Money deposited");
    }

    @Override
    public void withdrawn() {
        System.out.println("Money Withdrawn");
    }

}
public class Interface_BankAccount {
    public static void main(String[]args){
checkingAccount2 ch=new checkingAccount2();
ch.getBalenced();
ch.deposite();
ch.withdrawn();
SavingAccount1 sv=new SavingAccount1();
sv.getBalenced();
sv.deposite();
sv.withdrawn();
    }
}
