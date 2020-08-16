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
//        lowerCaseButton.setOnAction(actionEvent -> {
//            System.out.println(actionEvent.getEventType());
//            String orginalText = mainTextArea.getText();
//            String newText = orginalText.toLowerCase();
//            mainTextArea.setText(newText);
//        });

        lowerCaseButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(actionEvent.getEventType());
                System.out.println("Wcisnięto przycisk 2");
                String orginalText = mainTextArea.getText();
                String newText = orginalText.toLowerCase();
                mainTextArea.setText(newText);
            }
        });
        lowerCaseButton.addEventFilter(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
           // addEventFilter wywołuje się wcześniej niż addEventHandler
            public void handle(ActionEvent actionEvent) {
                System.out.println(actionEvent.getEventType());
                System.out.println("Wcisnieto przycisk 1");
                String orginalText = mainTextArea.getText();
                String newText = orginalText.toLowerCase();
                mainTextArea.setText(newText);

            }
        });
    }

}
