package ud3.EjerciciosClase.Clases;

import java.time.LocalDateTime;

public class User {
    private String username, password, email;
    private LocalDateTime createdAt, lastLogin;
    private boolean enabled;

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



    public static void main(String[] args) {
        User u = new User("holamellamoyago", "abc123.", "yago@yago.com", true);
        System.out.println(u.toString());
    }

    
}
