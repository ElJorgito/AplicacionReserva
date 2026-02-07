module org.example.aplicacionreserva {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.aplicacionreserva to javafx.fxml;
    exports org.example.aplicacionreserva;
}