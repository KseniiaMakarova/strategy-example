package mate.academy.storage;

import java.math.BigDecimal;

/**
 * Represents the storage.
 * Methods and fields in this class are static
 * because we have only one abstract storage for our app.
 * It should be similar to how the connection to a real database works.
 */
public class AccountBalanceStorage {
    private static final int MAXIMUM_CAPACITY = 10;
    private static final long[] accountNumbers = new long[MAXIMUM_CAPACITY];
    private static final BigDecimal[] amounts = new BigDecimal[MAXIMUM_CAPACITY];
    private static int size;

    public static void addNewAccount(long number) {
        accountNumbers[size] = number;
        // we create an empty account
        amounts[size] = BigDecimal.ZERO;
        size++;
    }

    public static void addMoneyToAccount(long number, BigDecimal amount) {
        int index = getIndex(number);
        if (index != -1) {
            amounts[index] = amounts[index].add(amount);
        }
    }

    public static void removeMoneyFromAccount(long number, BigDecimal amount) {
        int index = getIndex(number);
        if (index != -1) {
            amounts[index] = amounts[index].subtract(amount);
        }
    }

    private static int getIndex(long number) {
        for (int i = 0; i < size; i++) {
            if (accountNumbers[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
