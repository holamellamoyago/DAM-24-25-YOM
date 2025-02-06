module com.holamellamoyago.gestionusuariosfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.holamellamoyago.gestionusuariosfx to javafx.fxml;
    exports com.holamellamoyago.gestionusuariosfx;
}