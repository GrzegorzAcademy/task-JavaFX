package pl.javaStart.fxAction.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControlPaneController {

    @FXML
    private Button smalLettersButton;

    @FXML
    private Button bigLettersButton;

    public Button getSmalLettersButton() {
        return smalLettersButton;
    }

    public Button getBigLettersButton() {
        return bigLettersButton;
    }
    public void initialize(){
        System.out.println("ControlPane controller created");
    }
}
