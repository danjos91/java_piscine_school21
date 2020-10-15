//package com.company;

public class UsersArrayList implements  UsersList{

    User[] users = new User[10];

    public Integer getArraySize()
    {
        return users.length;
    }

    public void addUser(User newUser){
        for(int i = 0; i < users.length; i++){
            if(users[i] == null){
                users[i] = newUser;
                break;
            }
            if(i == users.length - 1){
                User[] tmp = new User[users.length + users.length/2];
                for(int j = 0; j < users.length; j++){
                    tmp[j] = users[j];
                }
                users = tmp;
            }
        }
    }

    public User GetUserById(Integer id) throws UserNotFoundException {
        for (User user : users) {
            if (user != null && user.GetId().equals(id)) {
                return user;
            }
        }
        throw new UserNotFoundException("UserNotFoundException");
    }

    public User GetUserByIndex(Integer index) throws UserNotFoundException {
        for (int i = 0; i < CountUsers(); i++) {
            if (i == index) {
                return users[i];
            }
        }
        throw new UserNotFoundException("UserNotFoundException");
    }

    public Integer CountUsers(){
        int i = 0;
        for (User user : users) {
            if(user != null){
                i++;
            }
            else{
                return i;
            }
        }
        return i;
    }

    public void printAllUsers(){
        for(int i = 0; i < CountUsers(); i++) {
            System.out.print("Index: " + i + "\t");
            users[i].printAllInfo();
        }
    }
}
