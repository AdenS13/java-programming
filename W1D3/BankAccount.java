public class BankAccount {

    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean deposit(int amount) {
        if(amount < 0 ) {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

    public boolean withdraw(int amount) {
        if(amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }

    }

    public boolean transfer(BankAccount account, int amount) {
        if(amount > balance) {
            return false;
        } else {
            balance -= amount;
            account.balance += amount;
            return true;
        }
    }
}
