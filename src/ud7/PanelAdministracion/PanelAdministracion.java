package ud7.PanelAdministracion;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PanelAdministracion extends Application {
    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane bp = new BorderPane();
        Label lb = new Label("Hola mundo");

        bp.setCenter(lb);

        // Scene scene = new Scene(bp, 300, 200);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("panelAdministracion.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);


        primaryStage.setScene(scene);
        primaryStage.setTitle("Panel de administración");
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
