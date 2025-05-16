package ud7.ApuntesFicheroTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjermploFicheroTextBufferReader {

    static final String PATH ="src/ud7/ApuntesFicheroTexto/";

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(PATH + "texto.txt"));
            int ch = in.read();
            while (ch != -1 ) {
                System.out.println((char)ch);
                ch = in.read();
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
