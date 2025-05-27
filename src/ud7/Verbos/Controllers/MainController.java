package ud7.Verbos.Controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.paint.Paint;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;
import ud7.Verbos.Model.IrregularVerb;
import ud7.Verbos.Model.Util;

public class MainController implements Initializable {

    @FXML
    private Label lblText;

    @FXML
    private TextField txtFieldParticiiple;

    @FXML
    private TextField txtFieldSimple;

    @FXML
    private TextField txtFieldTraduccion;

    @FXML
    private Button buttonCheck;

    @FXML
    Label txtMessage;

    @FXML
    MenuItem importarfichero;

    List<IrregularVerb> verbs;
    IrregularVerb irVrb;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        verbs = Util.readVerbs();
        irVrb = IrregularVerb.getVb(verbs);

        lblText.setText(irVrb.getInfinitive());
    }

    public void checkVerb(ActionEvent e) {
        System.out.println("Escrito: " + txtFieldSimple.getText());
        System.out.println("Correcto: " + irVrb.getSimple());
        int contador = 0;

        String message = "Corrige tu error: ";

        System.out.println(e.getSource().toString());

        if (txtFieldSimple.getText().toLowerCase().equals(irVrb.getSimple().toLowerCase())) {
            txtFieldSimple.setStyle("-fx-background-color:green;");
            contador++;
        } else {
            txtFieldSimple.setStyle("-fx-background-color:red;");
            message += "simple ";
        }

        if (txtFieldParticiiple.getText().toLowerCase().equals(irVrb.getParticiple().toLowerCase())) {
            txtFieldParticiiple.setStyle("-fx-background-color:green;");
            contador++;
        } else {
            txtFieldParticiiple.setStyle("-fx-background-color:red;");
            message += "participle ";
        }

        if (txtFieldTraduccion.getText().toLowerCase().equals(irVrb.getTranslation().toLowerCase())) {
            txtFieldTraduccion.setStyle("-fx-background-color:green;");
            contador++;
        } else {
            txtFieldTraduccion.setStyle("-fx-background-color:red;");
            message += "traducción ";
        }

        if (contador < 3) {
            txtMessage.setText(message);
        } else {
            txtMessage.setText("Enhorabuena , +1 punto");
            intercambiarPantallas();
        }

    }

    @FXML
    public void intercambiarPantallas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources/MainController.fxml"));
            Parent root = loader.load();

            Stage currentStage = (Stage) txtMessage.getScene().getWindow();

            currentStage.setScene(new Scene(root));
            currentStage.setTitle("Panel de usuarios");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    public void importarVerbos(ActionEvent e) {
        FileChooser fileChooser = new FileChooser();
        ExtensionFilter filter =  new ExtensionFilter("Debes importarlo en formato JSON", "*.json");

        fileChooser.setTitle("Importar JSON...");
        fileChooser.setInitialDirectory(new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu"));
        fileChooser.getExtensionFilters().add(filter);

        File selectedFile = fileChooser.showOpenDialog()

    }

}
