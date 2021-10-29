package mate.academy.strategy;

import mate.academy.model.Transaction;

public interface BankService {
    void processTransaction(Transaction transaction);
}
