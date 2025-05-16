package ud7.apuntesjavafx;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Ejemplo11 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();

        Menu menuColores = new Menu("Colores");
        MenuItem mmRojo = new MenuItem("Rojo");
        MenuItem mmVerde = new MenuItem("Verde");
        MenuItem mmAzul = new MenuItem("Azul");
        menuColores.getItems().addAll(mmRojo, mmVerde,mmAzul);
        
        Menu menu1 = new Menu("Rojo");
        menu1.setOnAction((e) -> System.out.println("Rojo"));
        MenuItem mm1 = new MenuItem("Rojo fuerte");
        menu1.getItems().add(mm1);
        
        
        
        Menu menu2 = new Menu("Verde");
        Menu menu3 = new Menu("Azul");
        MenuBar menuBar = new MenuBar(menuColores, menu1, menu2, menu3);
        
        
        
        Label textcenter = new Label("Center");
        Pane panelContorl = new Pane(textcenter);
        
        mmRojo.setOnAction((e) -> panelContorl.setBackground(Background.fill(Paint.valueOf("Red"))));
        mmAzul.setOnAction((e) -> panelContorl.setStyle("-fx-background-color: blue"));


        borderPane.setCenter(panelContorl);
        borderPane.setTop(menuBar);
        Scene scene = new Scene(borderPane, 300,200);
        

        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejercicio 11 con menú y colores de fondo");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
}
