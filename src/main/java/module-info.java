module javaFX {
requires javafx.graphics;
requires javafx.fxml;
requires javafx.controls;
exports pl.javaStart.fxEvent.main to javafx.graphics;
opens pl.javaStart.fxEvent.controller to javafx.fxml;

}
