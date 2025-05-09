package ud7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Saludar");
        Label lbl = new Label();
        VBox vBox = new VBox(btn, lbl);

        Scene scene = new Scene(vBox,300,200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("juas");
        primaryStage.setResizable(false);

        // btn.setOnAction(e -> {
        //    lbl.setText("Hola " + textField.getText()+ "!"); 
        // });
    }
}
