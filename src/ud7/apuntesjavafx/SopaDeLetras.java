package ud7.apuntesjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SopaDeLetras extends Application {

    static char[][] sopaLetras = {
            { 's', 'o', 'z', 'h', 'i' },
            { 's', 'e' },
            { 'p', 'o', 'v', 'h' },
            { 'p', 'o', 'z', 'e' },
            { 'p', 'o', 'z', 'h', 'n' }
    };

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Sopa de Letras");

        GridPane gridpane = new GridPane();
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {

                final int row = i;
                final int column = j;

                Label lblLetra = new Label(String.valueOf(sopaLetras[i][j]));
                lblLetra.setPrefSize(40, 40);
                lblLetra.setAlignment(Pos.CENTER);
                gridpane.add(lblLetra, j, i);

                lblLetra.setOnMouseClicked(e -> {
                    System.out.println("Fila: " + row);
                    System.out.println("Columna: " + column);

                    System.out.println("Fila: " + GridPane.getRowIndex(lblLetra));
                    System.out.println("Columna: " + GridPane.getColumnIndex(lblLetra));
                });

                
            }
        }

        gridpane.setOnMouseClicked(e ->  {
            System.out.println();
        } );

        primaryStage.setScene(new Scene(gridpane));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    void imprimirCoordenadas(ActionEvent e){
        System.out.println();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
