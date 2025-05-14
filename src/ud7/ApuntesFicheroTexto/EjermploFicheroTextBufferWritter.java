package ud7.ApuntesFicheroTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjermploFicheroTextBufferWritter {

    static final String PATH ="src/ud7/ApuntesFicheroTexto/";

    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(PATH + "Quijote.txt"));

            String l1 = "En un lugar de La Mancha";
            String l2 = "de cuyo nombre no quiero acordarme";

            for (int i = 0; i < l1.length(); i++) {
                out.write(l1.charAt(i));
            }
            out.newLine();

            out.write(l2);

            
            

            out.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.getMessage();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.getMessage();
            
        }
    }
}
