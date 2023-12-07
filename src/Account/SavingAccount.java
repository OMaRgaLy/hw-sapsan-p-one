package Account;

import Model.User;
import Service.DepositReward;

public class SavingAccount extends Account implements DepositReward {
    double rewardFactor;

    @Override
    public void payment(double amount) {
        super.payment(amount);
    }

    @Override
    public void replenishment(double amount) {
        super.replenishment(amount);
    }

    @Override
    public void transfer(double amount, Account account) {
        super.transfer(amount, account);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    public SavingAccount(String accountNumber, String accountCreated, double amount, User user) {
        super(accountNumber, accountCreated, amount, user);
    }

    public SavingAccount() {
        super();
    }

    @Override
    public void depositReward(double amount, double depositFactor) {

    }

    public SavingAccount(String accountNumber, String accountCreated, double amount, User user, double rewardFactor) {
        super(accountNumber, accountCreated, amount, user);
        this.rewardFactor = rewardFactor;
    }

    public SavingAccount(double rewardFactor) {
        this.rewardFactor = rewardFactor;
    }
}
