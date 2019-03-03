package cis350.upenn.edu.Backend;

public class User {
    private static int userIDCounter = 0;
    private int UserID;
    private String username;
    private String email;
    private String password;

    public User(){

    }
    public User(String username, String email, String password){
        this.UserID = userIDCounter++;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(String username, String password){
        this.UserID = userIDCounter++;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public void setUsername(String name) {
        this.username = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
