
public class Program {

    public static void main(String[] args) {
        User danny = new User(1, "Danny", 10000000);
        User maria = new User(2, "Maria", 400000);
        User pavel = new User(3, "Pavel", -500);
        User juan = new User(4, "Juan", 100);
        User diana = new User(5, "Diana", 750);

        danny.printAllInfo();
        maria.printAllInfo();
        pavel.printAllInfo();
        juan.printAllInfo();
        diana.printAllInfo();

        Transaction firstTransaction = new Transaction(diana, danny, 1000);
        firstTransaction.printAllTransactionInfo();
        danny.printAllInfo();
        diana.printAllInfo();

        Transaction secondTransaction = new Transaction(pavel, juan, 200);
        secondTransaction.printAllTransactionInfo();
        pavel.printAllInfo();
        juan.printAllInfo();

    }
}
