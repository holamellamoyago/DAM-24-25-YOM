package ud7.ApuntesFicheroTexto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjermploFicheroTexto {

    static final String PATH ="src/ud7/ApuntesFicheroTexto/";

    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader(PATH + "texto.txt");
            int ch = archivo.read();

            while (ch != -1 ) {
                System.out.println((char)ch);
                ch = archivo.read();
            }

            archivo.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.getMessage();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.getMessage();
            
        }
    }
}
