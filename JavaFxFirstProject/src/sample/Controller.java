package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {

    @FXML
    public Label label;
    public Button button;

    @FXML
    public void helloButton() {
        label.setText("Hello!");
    }
}
