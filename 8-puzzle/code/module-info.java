module code{
    requires javafx.controls;
    requires javafx.fxml;
    opens puzzlegui to javafx.fxml;
    exports puzzlegui to javafx.graphics;
}