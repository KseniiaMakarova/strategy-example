package mate.academy.strategy;

import mate.academy.model.Operation;

public class BankStrategy {
    public BankService getBankService(Operation operation) {
        return operation == Operation.REPLENISH
                ? new ReplenishBankService()
                : new WithdrawBankService();
    }
}
