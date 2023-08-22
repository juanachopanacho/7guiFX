module com.example.guifx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.guifx to javafx.fxml;
    exports com.example.guifx;
}