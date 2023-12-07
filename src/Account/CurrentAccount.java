package Account;

import Model.User;

public class CurrentAccount extends Account{

    public CurrentAccount(String accountNumber, String accountCreated, double amount, User user) {
        super(accountNumber, accountCreated, amount, user);
    }

    @Override
    public String toString() {
        return "CurrentAccount: " +
                " \naccountNumber = '" + accountNumber + '\'' +
                ", \naccountCreated = '" + accountCreated + '\'' +
                ", \namount = " + amount +
                ", \nuser = " + user +
                "; ";
    }
}
