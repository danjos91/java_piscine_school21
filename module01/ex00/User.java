

public class User {
    private Integer identifier;
    private String name;
    private  Integer balance;

    public User(Integer identifier, String name, Integer balance){
        SetIdentifier(identifier);
        SetName(name);
        SetBalance(balance);
    }

    public Integer GetIdentifier(){
        return identifier;
    }

    public void SetIdentifier(Integer identifier){
        this.identifier = identifier;
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
        System.out.println("User's ID: " + identifier + "\tName: " + name + "\t\tBalance: " + balance);
    }
}
