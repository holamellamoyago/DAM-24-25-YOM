package ud7.yomexamen.entrenamiento.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import ud7.yomexamen.entrenamiento.Appentrenamientos;
import ud7.yomexamen.entrenamiento.Models.entrenamiento;

// Yago Otero Martínez
public class EntrenamientosController implements Initializable {
    @FXML
    private ListView<entrenamiento> lvEntrenamientos;

    @FXML
    private TextField txtDatePicker;

    @FXML
    private TextField txtFieldNombre;

    @FXML
    private TextField txtFieldkm;

    @FXML
    private Button btnGuardar;

    @FXML
    private Label txtError;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lvEntrenamientos.getItems().addAll(Appentrenamientos.entrenamientos);
    }

    @FXML
    public void anhadirEntrenamiento() {

        int km = Integer.parseInt(txtFieldkm.getText());

        if (txtDatePicker.getText().isEmpty() || txtFieldNombre.getText().isEmpty()) {
            txtError.setText("Error al añadir ,algo vacio");
            return;
        }

        entrenamiento entr = new entrenamiento(txtFieldNombre.getText(), txtDatePicker.getText(), km);

        Appentrenamientos.entrenamientos.add(entr);

        Appentrenamientos.guardarEntrenamientos();

        lvEntrenamientos.getItems().clear();
        lvEntrenamientos.getItems().addAll(Appentrenamientos.entrenamientos);

    }
}
