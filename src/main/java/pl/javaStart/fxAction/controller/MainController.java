package pl.javaStart.fxAction.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;



    public void initialize() {
        Button smalLettersButton = controlPaneController.getSmalLettersButton();
        Button bigLettersButton = controlPaneController.getBigLettersButton();
        TextArea  textArea = contentPaneController.getMainTextArea();

        smalLettersButton.setOnAction(event -> textArea.setText(textArea.getText().toLowerCase()));
        bigLettersButton.setOnAction(event -> textArea.setText(textArea.getText().toUpperCase()));
    }
}