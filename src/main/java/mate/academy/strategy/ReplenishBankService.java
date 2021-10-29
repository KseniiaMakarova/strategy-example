package mate.academy.strategy;

import mate.academy.model.Transaction;
import mate.academy.storage.AccountBalanceStorage;

public class ReplenishBankService implements BankService {
    @Override
    public void processTransaction(Transaction transaction) {
        AccountBalanceStorage.addMoneyToAccount(
                transaction.getAccountNumber(), transaction.getAmount());
    }
}
