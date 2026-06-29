module com.digitalwatch.digitalwatch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.digitalwatch to javafx.fxml;
    exports com.digitalwatch;
}