package ud7.PanelAdministracion.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class UsuariosController implements Initializable {

    @FXML
    private ListView<String> lvUsuarios;

    @FXML
    private TextField txtFieldEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnDelete;

    @FXML
    private Label lblError;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lvUsuarios.getItems().addAll("lvUsuarios");
    }

    public void createUser() {
        if (txtFieldEmail.getText() != null) {
            lvUsuarios.getItems().add(txtFieldEmail.getText());
            txtFieldEmail.setText(null);
        } else {
            lblError.setText("Debes de introducir un mail y contraseñas válidos");
        }
    }

    public void showDeleteButton() {
        if (lvUsuarios.getSelectionModel().getSelectedItem() != null) {
            btnDelete.setDisable(false);
        } else {
            btnDelete.setDisable(true);
        }

    }

    public void deleteUser() {
        String user = lvUsuarios.getSelectionModel().getSelectedItem();
        lvUsuarios.getItems().remove(user);
    }

}
