package ud7.apuntesjavafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Mapa extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    String[] mapa = {
            "  Z       ",
            " *        ",
            "  *  *    ",
            "          ",
            " A        "
    };

    @Override
    public void start(Stage primaryStage) throws Exception {

        // for (int i = 0; i < mapa.length; i++)
        //     if (mapa[i].indexOf('A') != -1) {
        //         filaRobot = i;
        //         colRobot = mapa[i].indexOf('A');
        //     }

        GridPane gridPAne = new GridPane();

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length(); j++) {

                Label cuadro = new Label(String.valueOf(mapa[i].charAt(j)));
                cuadro.setPrefSize(40, 40);
                cuadro.setAlignment(Pos.CENTER);
                
                String css = "-fx-border-width: 1 1 1 1; -fx-border-color: black black black black;";
                
                switch (String.valueOf(mapa[i].charAt(j))) {
                    case "*":
                        css += "-fx-background-color:red;";
                        break;
                        case "A":
                        css += "-fx-background-color:green;";
                        break;
                        case "Z":
                        css += "-fx-background-color:yellow;";
                        break;
                        
                        default:
                        break;
                    }
                    cuadro.setStyle(css);
                    gridPAne.add(cuadro, j, i);
                // cuadro.setBorder(Border.stroke(Paint.valueOf("black")));


            }

        }
        Scene scene = new Scene(gridPAne);

        scene.setOnKeyTyped(e -> {
            System.out.println(e.getCode() + " - " + e.getCharacter());

            switch (e.getCharacter()) {
                case "w":
                    // gridPAne.get
                    break;
            
                default:
                    break;
            }
        } );



        primaryStage.setScene(scene);
        primaryStage.show();
    }

}