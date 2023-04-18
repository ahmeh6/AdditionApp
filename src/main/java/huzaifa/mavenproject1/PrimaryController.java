package huzaifa.mavenproject1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Label total;
    @FXML
    private TextField firstNum;
    @FXML
    private TextField secondNum;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void calculateTotal(ActionEvent event) {
        int sum;
        sum = Integer.parseInt(firstNum.getText()) +  Integer.parseInt(secondNum.getText());
        total.setText(""+sum);
    }
}
