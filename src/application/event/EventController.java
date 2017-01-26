package application.event;

import data.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class EventController {

	Event ev;
	public void setEvent(Event ev) {
		this.ev = ev;
	}
	
    @FXML
    private Text dateField;

    @FXML
    private Text organizatorField;

    @FXML
    private Text valueField;

    @FXML
    private Text addressField;

    @FXML
    private TextArea descArea;

    @FXML
    private Button buyButton;

    @FXML
    private Button backButton;

    

}
