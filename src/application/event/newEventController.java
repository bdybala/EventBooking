package application.event;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class newEventController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text scenetitle;

    @FXML
    private Text titleText;

    @FXML
    private TextField titleInput;

    @FXML
    private Text dateText;

    @FXML
    private DatePicker dateInput;

    @FXML
    private Text ageText;

    @FXML
    private TextField ageInput;

    @FXML
    private Text descText;

    @FXML
    private Text typeText;

    @FXML
    private TextField typeInput;

    @FXML
    private Text placeText;

    @FXML
    private Button addButton;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<?> listInput;

    @FXML
    void cancelAdding(ActionEvent event) {
    	Stage st = (Stage) cancelButton.getScene().getWindow();
    	st.close();
    }

    @FXML
    void submitAdding(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert scenetitle != null : "fx:id=\"scenetitle\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert titleText != null : "fx:id=\"titleText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert titleInput != null : "fx:id=\"titleInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert dateText != null : "fx:id=\"dateText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert dateInput != null : "fx:id=\"dateInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert ageText != null : "fx:id=\"ageText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert ageInput != null : "fx:id=\"ageInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert descText != null : "fx:id=\"descText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert typeText != null : "fx:id=\"typeText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert typeInput != null : "fx:id=\"typeInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert placeText != null : "fx:id=\"placeText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'newEventLayout.fxml'.";
        assert listInput != null : "fx:id=\"listInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";

    }
}
