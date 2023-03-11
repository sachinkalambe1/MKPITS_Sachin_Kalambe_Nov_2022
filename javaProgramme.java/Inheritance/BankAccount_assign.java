//Create a class called "BankAccount" that has a balance field and a method
//to withdraw money from the account. Create two child classes
//"CheckingAccount" and "SavingsAccount" that inherit from it.
class BankAccount1{
    int balence_field;
    void wihdraw_Money(){
        System.out.println("Withdraw money");
    }
}
class CheckingAccount extends BankAccount{
    void checkAcc(){
        System.out.println("check acconut");
    }
}
class savingAccount1 extends BankAccount1{
    void saveAccount(){
        System.out.println("saving account");
    }
}
public class BankAccount_assign {
    public static void main(String[]args){
savingAccount1 sv=new savingAccount1();
sv.wihdraw_Money();
sv.saveAccount();

    }
}
