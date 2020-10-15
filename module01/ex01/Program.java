
public class Program {

    public static void main(String[] args) {

        User danny = new User("Danny", 10000000);
        User maria = new User("Maria", 400000);
        User pavel = new User("Pavel", -500);

        danny.printAllInfo();
        maria.printAllInfo();
        pavel.printAllInfo();

        System.out.println("Not User's ID: " + UserIdsGenerator.getInstance().generateId());
        System.out.println("Not User's ID: " + UserIdsGenerator.getInstance().generateId());

        User juan = new User("Juan", 100);
        User diana = new User("Diana", 750);
        juan.printAllInfo();
        diana.printAllInfo();
    }
}
