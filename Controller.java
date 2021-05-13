package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {
    ArrayList<String> messageArray = new ArrayList<>();
    static final int MAX_SAME_MESSAGES = 3;

    @FXML
    TextArea textArea;
    @FXML
    TextField textField;

    public void sendMsg() {

        if (messageArray.size() >= MAX_SAME_MESSAGES) {
            int currentSameMessages = 0;
            for (int i = 0; i < MAX_SAME_MESSAGES; i++) {
                if (textField.getText().equals(messageArray.get(messageArray.size() - (i + 1)))) {
                    currentSameMessages++;
                }
            }
            if (currentSameMessages == MAX_SAME_MESSAGES) {

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Ошибка ввода");
                alert.setHeaderText(null);
                alert.setContentText("Нельзя вводить более " + MAX_SAME_MESSAGES + " одинаковых сообщений");
                alert.showAndWait();

            } else {
                textArea.appendText(textField.getText() + "\n");
                messageArray.add(textField.getText());
                textField.clear();
                textField.requestFocus();
            }

        } else {
            textArea.appendText(textField.getText() + "\n");
            messageArray.add(textField.getText());
            textField.clear();
            textField.requestFocus();
        }
    }
}

