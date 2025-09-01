public class Bank {
    private int balance=10000;
    public void withdraw(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Not Enough Balance");
        }
        else{
            balance-=balance;
            System.out.println("Withdraw Successfully, Remaining Balance: "+balance);
        }
    }

}
