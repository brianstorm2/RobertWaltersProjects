module com.example.loginfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.loginfx to javafx.fxml;
    exports com.example.loginfx;
}