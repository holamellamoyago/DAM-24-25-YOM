package ud7.ApuntesFicheroTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjermploFicheroTextoScanner {

    static final String PATH ="src/ud7/ApuntesFicheroTexto/";

    public static void main(String[] args) { 
        int suma = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader(PATH + "Enteros.txt"));
            Scanner sc = new Scanner(in);
            
            while (sc.hasNextInt() ) {
                int num = sc.nextInt();
                suma += num;
            }

            
            in.close();
            System.out.println(suma);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.getMessage();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.getMessage();
            
        }
    }
}
