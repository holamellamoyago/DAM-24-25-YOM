package ud7.PracticaUD7.Notas.Controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import ud7.PracticaUD7.Notas.AppNotas;

public class notasController implements Initializable {

    @FXML
    private Label txtResultado;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtResultado.setText(ponerResultado());
    }

    public String ponerResultado() {
        String str ="";
        try (BufferedReader in = new BufferedReader(new FileReader(AppNotas.PATH + "Promedios.txt"))) {
            String linea = in.readLine();
            while (linea != null) {
                str+= linea;
                str += "\n";

                linea = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;

    }

}
