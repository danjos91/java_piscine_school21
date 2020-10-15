//package com.company;

import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList {

    Transaction head = null;

    public void addTransaction(Transaction newTransaction){
        if(head == null)
        {
            head = newTransaction;
            head.lastTransaction = null;
            head.nextTransaction = null;
            return;
        }
        Transaction tmp;
        Transaction transaction = head;
        while(transaction != null) {
            //transaction.printAllTransactionInfo();
            transaction = transaction.nextTransaction;
            tmp = transaction;
        }
        transaction = newTransaction;
       // newTransaction.lastTransaction = tmp;
        newTransaction.nextTransaction = null;

    }

    public void removeTransactionById(UUID id){
        if(head == null){
            throw new TransactionNotFoundException("Head null");
        }
        Transaction transaction = head;
        while(transaction != null) {

            transaction = transaction.nextTransaction;
            if(transaction.GetTransactionId() == id){
                if(transaction.nextTransaction == null && transaction.lastTransaction == null){
                    transaction = null;
                }
                else if(transaction.nextTransaction == null){
                    transaction = transaction.lastTransaction;
                    transaction.nextTransaction = null;
                }
                else if(transaction.lastTransaction == null){
                    transaction = transaction.nextTransaction;
                    transaction.lastTransaction = null;
                }
                else{
                    (transaction.lastTransaction).nextTransaction = transaction.nextTransaction;
                    transaction = transaction.nextTransaction;
                }
            }
        }
        throw new TransactionNotFoundException("Id not found");
    }

    public Integer CountElements(){
        Transaction transaction = head;
        Integer i = 0;
        while(transaction != null) {
            transaction = transaction.nextTransaction;
            i++;
        }
        return i;
    }

    Transaction[] transactionsArray;

    public void transformIntoArray(){
        Transaction transaction = head;
        Integer count = CountElements();
        transactionsArray = new Transaction[count];
        Integer i = 0;

        while(transaction != null) {
            transactionsArray[i++] = transaction;
            transaction = transaction.nextTransaction;
            System.out.println(i);
        }
    }

    public void printAllTransactions(){
        transformIntoArray();
        for(int i = 0; i < transactionsArray.length; i++){
            transactionsArray[i].printAllTransactionInfo();
        }
    }

}
