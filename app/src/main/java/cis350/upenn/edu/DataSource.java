package cis350.upenn.edu;

import java.util.HashSet;
import java.util.Set;

public class DataSource {

    private static DataSource instance = new DataSource();

    private Set<User> userData = new HashSet<User>();

    public static DataSource getInstance(){
        return instance;
    }

    private DataSource(){
        // fake data
        User userOne = new User();
        User userTwo = new User();
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
