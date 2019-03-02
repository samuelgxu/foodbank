package cis350.upenn.edu.Backend;

public class User {
    private static int userIDCounter = 0;
    private int UserID;
    private String username;
    private String password;

    public User(String username, String password){
        this.UserID = userIDCounter++;
        this.username = username;
        this.password = password;
    }


}
