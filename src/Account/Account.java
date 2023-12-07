package Account;

import Model.User;
import Service.Payment;
import Service.Replenishment;
import Service.Transfer;
import Service.Withdraw;

public abstract class Account implements Payment, Replenishment, Transfer, Withdraw {
    String accountNumber;
    String accountCreated;
    double amount;
    User user;
    @Override
    public void payment(double amount) {
        this.amount -= amount;
    }

    @Override
    public void replenishment(double amount) {
        this.amount += amount;
    }

    @Override
    public void transfer(double amount, Account account) {
        this.amount -= amount;
        account.replenishment(amount);
        System.out.println("Transfer completed!");
    }

    @Override
    public void withdraw(double amount) {
        this.amount -= amount;
        System.out.println("Withdraw completed!");
    }

    public Account(String accountNumber, String accountCreated, double amount, User user) {
        this.accountNumber = accountNumber;
        this.accountCreated = accountCreated;
        this.amount = amount;
        this.user = user;
    }

    public Account() {
    }
}
