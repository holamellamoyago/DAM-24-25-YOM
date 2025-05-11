package ud7.PanelAdministracion.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuPrincipalController implements Initializable {

    @FXML
    private Button btnUsuarios;

    public void cambiarVentana() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../Resources/panelAdministracion.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) btnUsuarios.getScene().getWindow(); // boton es cualquier nodo de la escena actual
        stage.setScene(new Scene(root));
        stage.show();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}
