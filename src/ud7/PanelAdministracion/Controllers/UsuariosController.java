package ud7.PanelAdministracion.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import ud7.PanelAdministracion.Resources.User;

public class UsuariosController implements Initializable {

    @FXML
    private ListView<User> lvUsuarios;

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
        lvUsuarios.getItems().addAll(new User("Yagootero2003@gmail.com", "abc123."));
    }

    public void createUser() {
        if (txtFieldEmail.getText() != null && txtPassword.getText() != null) {
            lvUsuarios.getItems().add(new User(txtFieldEmail.getText(), txtPassword.getText()));
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
        User user = lvUsuarios.getSelectionModel().getSelectedItem();
        lvUsuarios.getItems().remove(user);
    }

}
