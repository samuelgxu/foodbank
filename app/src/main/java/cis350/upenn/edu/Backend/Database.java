package cis350.upenn.edu.Backend;

import java.util.LinkedList;
import java.util.List;

public class Database {

    private static Database instance = new Database();

    private List<User> userData = new LinkedList<User>();

    public static Database getInstance(){
        return instance;
    }

    private Database(){
        // fake data
        User userOne = new User("Bob", "bob@gmail.com", "abc");
        User userTwo = new User("James", "james@gmail.com", "def");
        userData.add(userOne);
        userData.add(userTwo);
    }

    public void addUser(User b){
        userData.add(b);
    }
    public void removeUser(User b){
        userData.remove(b);
    }

    public List<User> getAllUsers(){
        return userData; // can be modified outside, so better to return a clone
    }

    public boolean checkUser(String email) {
        for (User current : userData) {
            if (current.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public boolean checkUser(String email, String password) {
        for (User current : userData) {
            if (current.getEmail().equals(email) && current.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

}
