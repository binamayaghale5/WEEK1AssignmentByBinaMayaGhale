
// 2 Create a class BankAccount with attributes accountHolderName, accountNumber, and balance. Create a constructor to initialize them. Create methods deposit(amount) and withdraw(amount) which modify the balance. Show messages if withdrawal amount exceeds balance.
package easyToMedium.medium;
import java.util.Scanner;
public class BankAccount {
    public String accountHolderName;
    public int accountNumber;
    private double balance;

    BankAccount(String name, int accNum , double bal ){
        this.accountHolderName = name;
        this.accountNumber = accNum;
        this.balance = bal;
    }

    void deposit(double depositAmt){
        if(depositAmt>0){
            balance = balance + depositAmt;
            System.out.println("Deposited amount: " + depositAmt);
        }else{
            System.out.println("Invalid amount");
        }
    
    }

    void withdraw( double withdrawAmt){
        if(balance < withdrawAmt){
            System.out.println("Insufficient balance");
        }else if(withdrawAmt > 0){
            balance = balance - withdrawAmt;
            System.out.println("Withdrawn Amount: " + withdrawAmt);
        }else{
            System.out.println("Invalid Amount");
        }
    }

    void showBankBalance(){
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        BankAccount bank = new BankAccount("Samiksha",12345678, 1000 );

        System.out.println("Enter the amount to deposit: ");
        float depositAmt = sc.nextInt();
        bank.deposit(depositAmt);
        bank.showBankBalance();

        System.out.println("Enter the amount to withdraw: ");
        float withdrawAmt = sc.nextInt();
        bank.withdraw(withdrawAmt);
        bank.showBankBalance();

        
        

        sc.close();
    }

}