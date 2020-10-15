//package com.company;

public class Program {

    public static void main(String[] args) throws Exception {

        User danny = new User("Danny", 10000000);
        User maria = new User("Maria", 400000);
        User pavel = new User("Pavel", 500);

        danny.printAllInfo();
        maria.printAllInfo();
        pavel.printAllInfo();

        UsersArrayList usersList = new UsersArrayList();
        usersList.addUser(danny);
        usersList.addUser(maria);
        usersList.addUser(pavel);

        usersList.printAllUsers();

        Transaction transaction1 = new Transaction(danny, maria, 500);
        Transaction transaction2 = new Transaction(pavel, danny, 100);

        TransactionsLinkedList transactionsList = new TransactionsLinkedList();
        transactionsList.addTransaction(transaction1);
        transactionsList.addTransaction(transaction2);
        transactionsList.printAllTransactions();

    }
}
