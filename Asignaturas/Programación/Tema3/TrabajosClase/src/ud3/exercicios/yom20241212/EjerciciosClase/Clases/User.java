package ud3.EjerciciosClase.Clases;

import java.time.LocalDateTime;

public class User {
    String username, password, email;
    LocalDateTime createdAt, lastLogin;
    boolean enabled;

    public User(String username, String password, String email, boolean enabled) {
        try {
            this.username = username;
            this.password = password;
            this.email = email;
            this.enabled = enabled;

            createdAt = LocalDateTime.now();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public User(String username, String password){
        this(username, password, null, true);
    }

    public User(String username){
        this(username, null, null, true);
    }

    
    public String toString(){
        return username;
    }



    



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public static void main(String[] args) {
        User u = new User("holamellamoyago", "abc123.", "yago@yago.com", true);
        System.out.println(u.toString());
    }

    
}
