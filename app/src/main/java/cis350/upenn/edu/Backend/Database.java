package cis350.upenn.edu.Backend;

import java.util.HashSet;
import java.util.Set;

public class Database {

    private static Database instance = new Database();

    private Set<User> userData = new HashSet<User>();

    public static Database getInstance(){
        return instance;
    }

    private Database(){
        // fake data
        User userOne = new User("Bob", "abc");
        User userTwo = new User("James", "def");
        userData.add(userOne);
        userData.add(userTwo);
    }

    public void addUser(User b){
        userData.add(b);
    }
    public void removeUser(User b){
        userData.remove(b);
    }

    public Set<User> allUsers(){
        return userData; // can be modified outside, so better to return a clone
    }
}
