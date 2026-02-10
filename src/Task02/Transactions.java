package Task02;

import Task02.Enums.TransactionType;
import Task02.Utils.UniqueNumber;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Transactions {
    private final String transactionID;
    private final LocalDateTime transactionDate;
    private double transactionAmount;
    private TransactionType transactionType;

    public Transactions( double transactionAmount, TransactionType transactionType) {
        this.transactionID = UniqueNumber.generateTransactionID();
        this.transactionDate = LocalDateTime.now();
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }

    // Getter methods
    public String getTransactionID() {
        return transactionID;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionID +
                " | Date: " + transactionDate +
                " | Amount: " + transactionAmount +
                " | Type: " + transactionType;
    }
}
