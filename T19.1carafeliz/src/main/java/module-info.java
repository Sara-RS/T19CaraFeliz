module com.mycompany.t19.carafeliz {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.t19.carafeliz to javafx.fxml;
    exports com.mycompany.t19.carafeliz;
}
