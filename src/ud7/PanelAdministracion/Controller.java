package ud7.PanelAdministracion;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class Controller implements Initializable{


    @FXML
    private ListView<String> lvUsuarios;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lvUsuarios.getItems().addAll("lvUsuarios");
    }
    
}
