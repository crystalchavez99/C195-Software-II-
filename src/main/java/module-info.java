module com.example.c195 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens com.example.c195 to javafx.fxml;
    exports com.example.c195;
}