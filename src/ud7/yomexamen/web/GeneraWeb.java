package ud7.yomexamen.web;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeneraWeb extends Application {

    // Yago Otero Martínez
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(GeneraWeb.class.getResource("Resources/web.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("Genera web");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
