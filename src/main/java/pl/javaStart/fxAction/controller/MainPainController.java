package pl.javaStart.fxAction.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class MainPainController {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

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

        mainTextArea.addEventFilter(MouseEvent.MOUSE_ENTERED,
                mouseEvent -> System.out.println("Mysz w obszarze area" + " współrzędna wejścia X " +
                        mouseEvent.getX() + " współrzędna wejścia Y " +
                        mouseEvent.getY()));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_EXITED,
                mouseEvent -> System.out.println("Mysz poza Area"));
//        mainTextArea.addEventFilter(MouseEvent.MOUSE_MOVED,
//                mouseEvent -> System.out.println("mysz porusza sie w Area"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_DRAGGED,
                mouseEvent -> System.out.println("Mysz porusza się w Area z wciśniętym przyciskiem"));
    }


}

