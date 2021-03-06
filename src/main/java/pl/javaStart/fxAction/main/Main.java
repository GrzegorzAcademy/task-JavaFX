package pl.javaStart.fxAction.main;

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
        VBox load = FXMLLoader.load(getClass().getResource("/mainPane.fxml"));
        Scene scene = new Scene(load);
        stage.setTitle("Event Example");
        stage.setScene(scene);
        stage.show();

    }
}
