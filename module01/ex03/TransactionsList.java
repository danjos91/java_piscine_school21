//package com.company;

import java.util.UUID;

public interface TransactionsList {

    void addTransaction(Transaction newTransaction);
    void removeTransactionById(UUID id);
    void transformIntoArray();

}
