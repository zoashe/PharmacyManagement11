module com.example.pharmacymanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pharmacymanagement to javafx.fxml;
    exports com.example.pharmacymanagement;
}