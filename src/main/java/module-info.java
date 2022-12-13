module com.example.pruebacustom2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebacustom2 to javafx.fxml;
    exports com.example.pruebacustom2;
}