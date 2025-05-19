package ud7.Verbs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Resources/simple.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);

            primaryStage.setTitle("Aprende los verbos ! ");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.centerOnScreen();
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Eroro");

        }

    }
}
