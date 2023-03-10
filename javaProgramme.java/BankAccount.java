//Create a class called "BankAccount" that has a balance field and a method
//to deposit money into the account. Create two child classes
//"CheckingAccount" and "SavingsAccount" that inherit from it.
class BankAccount {
    int balenced;
    void deposite(){
        System.out.println("deposite money");
    }
}
class checkingAccount extends BankAccount{
    void checkAcc(){
        System.out.println("checking account");
    }
}
class SavingAccount extends BankAccount{
    void saveAcc(){
        System.out.println("Saving Account");
    }
}
class BankAcc{
    public static void main(String[]args){
        SavingAccount ob=new SavingAccount();
        ob.saveAcc();
        checkingAccount ob1=new checkingAccount();
        ob1.checkAcc();
        ob1.deposite();
    }
}

