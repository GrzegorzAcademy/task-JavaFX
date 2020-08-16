module javaFX {
   requires javafx.fxml;
   requires javafx.graphics;
   requires javafx.controls;
   exports pl.javaStart.fxAction.main to javafx.graphics;
   opens pl.javaStart.fxAction.controller to javafx.fxml;
}