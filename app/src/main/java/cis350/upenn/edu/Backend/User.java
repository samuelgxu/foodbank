package cis350.upenn.edu.Backend;

public class User {
    private static int userIDCounter = 0;
    private int UserID;
    private String username;
    private String email;
    private String password;

    public User(String username, String password){
        this.UserID = userIDCounter++;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
