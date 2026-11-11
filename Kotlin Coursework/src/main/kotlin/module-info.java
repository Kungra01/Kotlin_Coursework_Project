module com.example.kotlin_coursework {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.kotlin_coursework to javafx.fxml;
    exports com.example.kotlin_coursework;
}