package kolomytsev.course2.four.Online.src.main.java.com.example.online;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    public TextArea messageField;
    public ListView<String> mainTextArea;

    @FXML
    protected void onHelloButtonClick() {
        String message = messageField.getText();
        mainTextArea.getItems().add(message);
        messageField.clear();
    }
}