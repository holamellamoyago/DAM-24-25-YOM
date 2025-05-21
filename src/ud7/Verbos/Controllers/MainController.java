package ud7.Verbos.Controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ud7.Verbos.Model.IrregularVerb;
import ud7.Verbos.Model.Util;

public class MainController implements Initializable  {

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

    List<IrregularVerb> verbs;
    IrregularVerb irVrb;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        verbs = Util.readVerbs();
        irVrb = IrregularVerb.getVb(verbs);

        lblText.setText(irVrb.getInfinitive());
    }


}
