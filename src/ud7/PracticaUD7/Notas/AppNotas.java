package ud7.PracticaUD7.Notas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AppNotas extends Application {
    final public static String PATH = "src/ud7/PracticaUD7/Notas/";

    public static void main(String[] args) {
        launch(args);

        try {
            BufferedReader in = new BufferedReader(new FileReader(PATH + "Notas.txt"));
            String linea = in.readLine();
            ArrayList<String> textos = new ArrayList<>();

            while (linea != null) {
                String[] datos = linea.split(",");
                double total = 0;

                for (int i = 1; i < datos.length; i++) {
                    total += Integer.parseInt(datos[i]);
                }

                total = total / (datos.length-1);


                String str1 = datos[0] + ": " + total;
                textos.add(str1);

                linea = in.readLine();

            }

            crearArchivo(textos);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        

    }

    @Override   
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(AppNotas.class.getResource( "Resources/notas.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("App Notas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void crearArchivo(ArrayList<String> textos) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(PATH + "Promedios.txt"))) {
            for (String string : textos) {
                out.write(string);
                out.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
