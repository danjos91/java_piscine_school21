

public class Program {

    public static void main(String[] args) throws Exception {

        User danny = new User("Danny", 10000000);
        User maria = new User("Maria", 400000);
        User pavel = new User("Pavel", -500);

        danny.printAllInfo();
        maria.printAllInfo();
        pavel.printAllInfo();

        UsersArrayList usersList = new UsersArrayList();
        System.out.println("Array size after adding 0 users: " + usersList.getArraySize());
        System.out.println("Current number of users on UsersList:" + usersList.CountUsers());
        for(int i = 0; i < 11; i++) {
            usersList.addUser(danny);
        }
        usersList.addUser(maria);
        usersList.addUser(pavel);

        usersList.printAllUsers();

        System.out.println("Array size after adding 11 users: " + usersList.getArraySize());
        System.out.println("Current number of users on UsersList:" + usersList.CountUsers());
        System.out.println("Get User by ID: " + "User Name: " + usersList.GetUserById(3).GetName());
        System.out.println("Get User by Index: " + "User Name: " + usersList.GetUserByIndex(12).GetName());

    }
}
