package main.com.griddynamics;

public class BankAccount {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bugs = new BankAccount(100);
        BankAccount daffy = new BankAccount(100);
        Thread bugsThread = new Thread(()-> {
            for (int i = 0; i < 1_000_000; i++)
                transferFrom(daffy, bugs, 100);
        });
        Thread daffyThread = new Thread(()-> {
            for (int i = 0; i < 1_000_000; i++)
                transferFrom(bugs, daffy, 100);
        });
        bugsThread.start(); daffyThread.start();
        bugsThread.join(); daffyThread.join();
        System.out.println(bugs.balance() + daffy.balance());
    }

    private long balance;
    public BankAccount(long balance) {
        this.balance = balance;
    }
    static synchronized void transferFrom(BankAccount source,
                             BankAccount dest, long amount) {
        source.balance -= amount;
        dest.balance += amount;
    }
    public long balance() {
        return balance;
    }
}