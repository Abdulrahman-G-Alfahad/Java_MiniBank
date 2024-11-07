package Bank;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class BankSingleton {
    private String name;
    private List<User> users = new ArrayList<User>();

    private static BankSingleton bank;

    private BankSingleton() {
    }

    public static BankSingleton getInstance() {
        if (bank == null){
            bank = new BankSingleton();
        }
        return bank;
    }

    public User createUser(String username, String password) throws IllegalArgumentException {
        for (User user : users){
            if (user.getUsername().equals(username)){
                throw new IllegalArgumentException("Username already exists");
            }
        }
        User user = new User(password, username);
        users.add(user);
        return user;
    }

    public User authenticate(String username, String password){
        for (User user : users){
            if (user.getUsername().equals(username)){
                if (user.getPassword().equals(password)){
                    return user;
                }
                return null;
            }
        }
        return null;
    }
}
