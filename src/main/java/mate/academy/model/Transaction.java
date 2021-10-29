package mate.academy.model;

import java.math.BigDecimal;

public class Transaction {
    private Operation operation;
    private long accountNumber;
    private BigDecimal amount;

    public Transaction(Operation operation, long accountNumber, BigDecimal amount) {
        this.operation = operation;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
