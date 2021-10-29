package mate.academy;

import java.math.BigDecimal;
import mate.academy.model.Operation;
import mate.academy.model.Transaction;
import mate.academy.storage.AccountBalanceStorage;
import mate.academy.strategy.BankService;
import mate.academy.strategy.BankStrategy;

public class Main {
    public static void main(String[] args) {
        AccountBalanceStorage.addNewAccount(1);
        AccountBalanceStorage.addNewAccount(2);

        Transaction[] transactions = new Transaction[]{
                new Transaction(Operation.REPLENISH, 1, BigDecimal.valueOf(100)),
                new Transaction(Operation.REPLENISH, 2, BigDecimal.valueOf(50)),
                new Transaction(Operation.REPLENISH, 2, BigDecimal.valueOf(20)),
                new Transaction(Operation.WITHDRAW, 1, BigDecimal.valueOf(100)),
                new Transaction(Operation.WITHDRAW, 2, BigDecimal.valueOf(15))
        };

        BankStrategy bankStrategy = new BankStrategy();

        for (Transaction transaction : transactions) {
            BankService implementation = bankStrategy.getBankService(transaction.getOperation());
            implementation.processTransaction(transaction);
        }
    }
}
