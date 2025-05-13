package ud7.apuntesjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EjemploEventos extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("Button");
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("3. Button Event Handler"));
        btn.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> System.out.println("2. Vbox Event Filter"));

        Button btn2 = new Button();
        btn2.setText("Button2");
        // btn2.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->
        // System.out.println("Buttonw Event Handler"));

        /***
         * Campo de texto que al presionar las teclas del teclado imprime
         * un mensaje en consola con el ćodigo de tecla pulsada
         ***/
        TextField campoTexto = new TextField();
        campoTexto
                .setOnKeyPressed((KeyEvent evento) -> System.out.println("Se ha pulsado la tecla " + evento.getCode()));

        Scene scene = new Scene(campoTexto, 400, 400);

        /***
         * Filtro de evento que detiene la propagación de un evento de teclado
         * cuando el caracter escrito no es un número
         ***/
        scene.addEventFilter(KeyEvent.KEY_TYPED, e -> {
            if (!Character.isDigit(e.getCharacter().charAt(0))) {
                e.consume();
            }
        });




        VBox root = new VBox(btn, btn2, campoTexto);
        // root.getChildren().add(btn);
        root.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> System.out.println("1. Vbox Event Filter"));
        root.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("4. VBOX Event Handler"));

        Scene scene2 = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX Manejo de Eventos");
        primaryStage.setScene(scene2);
        primaryStage.show();

    }

}
