module javaFX {
   requires javafx.fxml;

   requires javafx.controls;

   exports pl.javaStart.fxAction.main;
   opens pl.javaStart.fxAction.controller to javafx.fxml;
}