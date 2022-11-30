public class BankAccount {

    private int number;
    private int balance;
    private String name;
    private String email;
    private String phoneNumber;

    public void deposit(int number){
        boolean isPositiveNumber = number >=0;
        if(isPositiveNumber)
        this.balance += number;
        else {
            System.out.println("deposit cannot be a negative amount");
        }
        System.out.println("Deposited amount: " + number);
    }

    public void withdraw(int number){
        number = -number;
        boolean isNegativeNumber = number <=0;
        if(isNegativeNumber && balance + number >= 0)
            this.balance += number;
        else {
            System.out.println("withdraw cannot be a positive amount or you are trying to withdraw more than your balance.");
        }
        System.out.println("Withdrawn amount: " + number);

    }

    public int getBalance(){
        return this.balance;
    }


}
