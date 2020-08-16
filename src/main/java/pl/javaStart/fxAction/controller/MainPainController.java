package pl.javaStart.fxAction.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainPainController {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    public void initialize() {

    }

    public void toLowerCaseAction(ActionEvent actionEvent) {
        System.out.println(actionEvent.getEventType());
        System.out.println("Wcisnieto przycisk 1");
        String orginalText = mainTextArea.getText();
        String newText = orginalText.toLowerCase();
        mainTextArea.setText(newText);
    }

}
