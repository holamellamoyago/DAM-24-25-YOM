package ud7.PanelAdministracion.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void abrirPantallaUsuarios() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources/panelAdministracion.fxml"));
            Parent root = loader.load();

            UsuariosController usuariosController = loader.getController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Segunda pantalla");

            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void intercambiarPantallas(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources/panelAdministracion.fxml"));
            Parent root = loader.load();

            Stage currentStage = (Stage) btnUsuarios.getScene().getWindow();

            currentStage.setScene(new Scene(root));
            currentStage.setTitle("Panel de usuarios");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
