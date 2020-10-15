

public class User {
    private final Integer id;
    private String name;
    private  Integer balance;

    public User(String name, Integer balance){
        this.id = UserIdsGenerator.getInstance().generateId();
        SetName(name);
        SetBalance(balance);
    }

    public Integer GetId(){
        return id;
    }

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public Integer GetBalance(){
        return balance;
    }

    public void SetBalance(int balance){
        this.balance = balance;
    }

    public void printAllInfo(){
        System.out.println("User's ID: " + id + "\tName: " + name + "\t\tBalance: " + balance);
    }
}
