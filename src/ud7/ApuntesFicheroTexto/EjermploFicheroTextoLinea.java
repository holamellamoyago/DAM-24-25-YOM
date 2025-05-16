package ud7.ApuntesFicheroTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjermploFicheroTextoLinea {

    static final String PATH ="src/ud7/ApuntesFicheroTexto/";

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(PATH + "texto.txt"));
            String linea = in.readLine();
            while (linea != null ) {
                System.out.println(linea);
                linea = in.readLine();
            }

            in.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.getMessage();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.getMessage();
            
        }
    }
}
