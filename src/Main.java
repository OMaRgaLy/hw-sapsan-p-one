import Account.CurrentAccount;
import Account.SavingAccount;
import Model.User;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User(UUID.randomUUID().toString(), "Arikun", "Kerr", "mail@mail.com", "77776970801", "13.09.1994");
        User secondUser = new User(UUID.randomUUID().toString(), "Arigana", "Kerr", "mail@mail.com", "7777697080X", "13.09.1994");
        CurrentAccount firstCurrentAccount = new CurrentAccount("KZ0000C0472495AXAX", "10.08.2017", 2000.00, firstUser);
        CurrentAccount secondCurrentAccount = new CurrentAccount("KZ0000C0472495AXAX", "11.08.2017", 10000.00, secondUser);
        SavingAccount firstSavingAccount = new SavingAccount("KZ0000C0472497AXAX", "10.08.2017", 1000.00, firstUser, 17.00);
        SavingAccount secondSavingAccount = new SavingAccount("KZ0000C0472498AXAX", "11.08.2017", 10000.00, secondUser, 17.00);
        firstCurrentAccount.replenishment(10000);
        secondCurrentAccount.replenishment(10000);
        firstCurrentAccount.transfer(1000, secondCurrentAccount);
        firstSavingAccount.transfer(1000, firstCurrentAccount);
        secondSavingAccount.transfer(1000, secondCurrentAccount);

        System.out.println(firstCurrentAccount);
        System.out.println(secondCurrentAccount);
    }
}