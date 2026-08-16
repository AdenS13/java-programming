public class Main {
    public static void main(String[] args) {
        BankAccount  aden = new BankAccount("Aden Smith", 20000);
        BankAccount sarah = new BankAccount("Sarah Duda", 120000);

        String accountName = aden.getName();
        int accountBalance = aden.getBalance();
        String accountNameTwo = sarah.getName();
        int accountBalanceTwo = sarah.getBalance();

        System.out.println("Hello " + accountName + ", welcome to your bank account!");
        System.out.println("Your remaining balance is - $" + accountBalance);

        boolean depositSuccessful = aden.deposit(5000);
        
        if(depositSuccessful) {
            accountBalance = aden.getBalance();
            System.out.println("Deposit Succesful. Your new balance: " + accountBalance);
        } else {
            System.out.println("You dum dum. How did you try to deposit negative money?");
        }

        boolean withdrawSuccessful = aden.withdraw(25);

        if(withdrawSuccessful) {
            accountBalance = aden.getBalance();
            System.out.println("Withdrawal Successful. Your new balance: " + accountBalance);
        } else {
            System.out.println("Not enough funds. Your balance: " + accountBalance);
        }

        boolean transferSuccessful = sarah.transfer(aden, 20000);

        if(transferSuccessful) {
            accountBalance = aden.getBalance();
            accountBalanceTwo = sarah.getBalance();
            System.out.println("Transfer Successful. Your new balance: " + accountBalanceTwo);
        } else {
            System.out.println("Not enough funds. Your balance: " + accountBalanceTwo);
        }
        
    }
}