package ud7.PracticaUD7.InventarioFX.Controllers;

import java.beans.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import com.azul.crs.internal.asm.Label;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import ud7.PracticaUD7.InventarioFX.AppInventario;
import ud7.PracticaUD7.InventarioFX.Models.Producto;

public class InventarioController implements Initializable {
    @FXML
    private ListView<Producto> lsProductos;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnAnadir;

    @FXML
    private TextField txtFieldCantidad;

    @FXML
    private TextField txtFieldCod;

    @FXML
    private TextField txtFieldNombre;

    @FXML
    private TextField txtFieldPrecio;

    @FXML 
    private Labeled txtError;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        AppInventario.importarProductos();
        lsProductos.getItems().add(new Producto(2, 2, "Martillo", 2));
        lsProductos.getItems().addAll(AppInventario.productos);
    }

    @FXML
    public void guardarProductos() {
        AppInventario.exportarProductos(AppInventario.productos);
    }

    @FXML
    public void anhadirProductos() {

        int codigo = Integer.parseInt(txtFieldCod.getText()); 
        int cantidad = Integer.parseInt(txtFieldCantidad.getText()); 
        double precio = Integer.parseInt(txtFieldPrecio.getText()); 

        Producto pr = new Producto(cantidad, codigo, txtFieldNombre.getText(), precio);

        if (!AppInventario.productos.add(pr)) {
            System.out.println("Hubo un problema , ya existe ese codigo");
            txtError.setText("Ya existe un producto con ese inventario");
        } else {
            lsProductos.getItems().add(pr);
            guardarProductos();
        }
    }

}
