

interface UsersList {

    void addUser(User newUser);

    User GetUserById(Integer id) throws Exception;

    User GetUserByIndex(Integer index) throws Exception;

    Integer CountUsers();

}
