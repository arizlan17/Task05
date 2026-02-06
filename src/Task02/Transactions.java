package Task02;

import Task02.Enums.TransactionType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Transactions {
    private String transactionID;
    private LocalDateTime transactionDate;
    private double transactionAmount;
    private TransactionType transactionType;

    public Transactions(String transactionID, double transactionAmount, TransactionType transactionType) {
        this.transactionID = transactionID;
        this.transactionDate = LocalDateTime.now();
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }
}
