package pl.javaStart.fxAction.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainPainController {

    @FXML
    private TextArea LeftTextArea;

    @FXML
    private TextArea RightTextArea;

    @FXML
    private Button ButtonClerar;


    public void initialize() {
//        mainTextArea.setOnKeyPressed(keyEvent -> System.out.println("Wciśnieto przycisk :" + keyEvent.getCharacter()));
//        mainTextArea.setOnKeyReleased(keyEvent -> System.out.println("Zwolniono przycisk : " + keyEvent.getCharacter()));
//        mainTextArea.setOnKeyTyped(keyEvent -> System.out.println("Wcisnięto i zwolniono przycisk :" + keyEvent.getCharacter()));


//        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent ->
//                System.out.println("Wcisnięto i zwolniono przycisk :" + keyEvent.getCharacter()));
//        mainTextArea.addEventFilter(MouseEvent.MOUSE_CLICKED,
//                mouseEvent -> System.out.println("klick mouse" + mouseEvent.getClickCount() + " "
//                        + mouseEvent.getButton() + " "
//                        + mouseEvent.getButton()));
//        mainTextArea.addEventFilter(MouseEvent.MOUSE_PRESSED,
//                mouseEvent -> System.out.println("mouse pressed"));
//        mainTextArea.addEventFilter(MouseEvent.MOUSE_RELEASED,
//                mouseEvent -> System.out.println("mouse released"));
        LeftTextArea.setText()
    }


}

