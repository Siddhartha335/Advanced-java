module com.example.unit6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.unit6 to javafx.fxml;
    exports com.example.unit6;
}