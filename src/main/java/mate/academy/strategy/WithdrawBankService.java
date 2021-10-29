package mate.academy.strategy;

import mate.academy.model.Transaction;
import mate.academy.storage.AccountBalanceStorage;

public class WithdrawBankService implements BankService {
    @Override
    public void processTransaction(Transaction transaction) {
        AccountBalanceStorage.removeMoneyFromAccount(
                transaction.getAccountNumber(), transaction.getAmount());
    }
}
