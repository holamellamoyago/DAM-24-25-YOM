package ud7.yomexamen.entrenamiento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ud7.yomexamen.entrenamiento.Models.entrenamiento;

// Yago Otero Martínez

public class Appentrenamientos extends Application {
    public static final String PATH = "src/ud7/yomexamen/entrenamiento";
    public static List<entrenamiento> entrenamientos = new ArrayList<>();

    public static void main(String[] args) {
        importarEntrenamientos();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Appentrenamientos.class.getResource("Resources/entrenamientos.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Entrenamientos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void guardarEntrenamientos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Entrenamientos.dat"))) {
            out.writeObject(entrenamientos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void importarEntrenamientos() {

        File archivo = new File("Entrenamientos.dat");

        if (!archivo.exists() || archivo == null) {
            entrenamientos = new ArrayList<>();
            return;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Entrenamientos.dat"))) {
            entrenamientos = (List<entrenamiento>) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
