//Create a class called "Account" with two child classes "CheckingAccount"
  //      and "SavingsAccount". Each child class should have its own unique
    //    method.
class Account{
    void acc(){
        System.out.println("Account created");
    }
}
class checkingAccount1 extends Account{
    void checkAcc(){
        System.out.println("check account");
    }
}
class savingAccount extends Account{
    void saveAcc(){
        System.out.println("Saving account");
    }
}
public class Account1_Assign {
    public static void main(String[]args){
        savingAccount sv=new savingAccount();
        sv.acc();
        sv.saveAcc();
        checkingAccount1 ca=new checkingAccount1();
        ca.checkAcc();
    }
}
