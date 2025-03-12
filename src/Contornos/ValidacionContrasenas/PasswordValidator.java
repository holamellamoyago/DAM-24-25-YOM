package Contornos.ValidacionContrasenas;

public class PasswordValidator { 
    public static boolean isValid(String password) { 

        if (password.length() <= 8) {  
            return false; 
        } 

        boolean hasUpperCase = false; 
        boolean hasDigit = false; 
        for (char c : password.toCharArray()) { 

            // Corrijo error , esta buscando lowecase en vez de uppercase
            if (Character.isUpperCase(c)) {  
                hasUpperCase = true; 
            } 

            // Corrijo error , esta poniendo que es false cuando debería de marcar que sí 
            if (Character.isDigit(c)) { 
                hasDigit = true;  
            } 
        } 
        return hasUpperCase || hasDigit;  
    } 
} 
