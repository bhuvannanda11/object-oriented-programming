public class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositingMoney(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited money :"+amount);
        }
        else{
            System.out.println("Invalid Transaction");
        }
    }

    public void withdrawingMoney(double amount){
        if(amount >0 && amount <= balance){
            balance -= amount;
            System.out.println("WithDrawing Money :"+amount);
        }
        else if(amount > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Invalid Transaction");
        }
    }

    public void currentBalance(){
        System.out.println("Current balance is :"+balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Bhuvan", 1011, 1000000);

        b1.currentBalance();
        System.out.println();
        b1.depositingMoney(500);
        b1.currentBalance();
        System.out.println();
        b1.withdrawingMoney(700);
        b1.currentBalance();

    }
}
