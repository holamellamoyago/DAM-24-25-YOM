package ud7.yomexamen.web.Controllers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

// Yago Otero Martínez

public class webController {
    final public static String PATH = "src/ud7/PracticaUD7/yomexamen/web/";

    @FXML
    private TextField txtFieldDes;

    @FXML
    private TextField txtFieldTitulo;

    @FXML
    private TextField txtFieldnombreht;

    @FXML
    private TextField txtFieldtetxten;

    @FXML
    private TextField txtFieldurlen;

    @FXML
    private Button btnGenerar;

    @FXML
    private Label txtErrror;

    public void generarWeb() {
        String str1 = "<html>\n<head>\n<title>" + txtFieldTitulo.getText() + "</title>\n<meta charset=\"utf-8\">";
        String str2 = "</head>\n\n<body>\n<h1>" + txtFieldTitulo.getText() + "</h1>\n<p>" + txtFieldDes.getText()
                + "<br>";
        String str3 = "<a href=\"" + txtFieldurlen.getText() + "\">" + txtFieldtetxten.getText() + "</a>";
        String str4 = "</p>\n</body>\r</html>";

        ArrayList<String> lineas = new ArrayList<>(List.of(str1, str2, str3, str4));

        if (txtFieldTitulo.getText().isEmpty() || txtFieldDes.getText().isEmpty()
                || txtFieldnombreht.getText().isEmpty() || txtFieldurlen.getText().isEmpty()) {
            txtErrror.setText("Debes cubrir todos los campos! ");
            return;
        }

        // Quería poner esto -> (PATH + "Models/" + txtFieldnombreht.getText()+".html")
        // pero no entiendo porque no me deja
        try (BufferedWriter out = new BufferedWriter(new FileWriter(txtFieldnombreht.getText() + ".html"))) {
            for (String string : lineas) {
                out.write(string);
            }

            txtErrror.setText("Creado perfecto ! ");
        } catch (IOException e) {

            e.printStackTrace();
            txtErrror.setText("error al crear ");
        }
    }

}
