module co.edu.uniquindio.ingesis.javafx.ejemplo {
    requires javafx.controls;
    requires javafx.fxml;


    opens controlador to javafx.fxml;
    exports controlador;
    opens modelo to javafx.fxml;
    exports modelo;
    opens vista to javafx.fxml;
    exports vista;
}