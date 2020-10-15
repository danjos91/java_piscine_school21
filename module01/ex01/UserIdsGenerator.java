

import java.security.Signature;

public class UserIdsGenerator {

    private static UserIdsGenerator instance;

    public static UserIdsGenerator getInstance(){
        if(instance == null){
            instance = new UserIdsGenerator();
        }
        return instance;
    }

    private static Integer id = 0;

    public Integer generateId(){
        return ++id;
    }
}
