package pl.javaStart.fxEvent.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox load = FXMLLoader.load(getClass().getResource("/fxml/ContentPane.fxml"));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.setTitle("Events");
        stage.show();
    }
}
