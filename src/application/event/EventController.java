package application.event;

import java.net.URL;
import java.util.ResourceBundle;

import data.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class EventController {

	Event ev;
	public void setEv(Event ev) {
		this.ev = ev;
	}

	@FXML
	private Text titleField;

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

	@FXML
	void initialize() {
		assert dateField != null : "fx:id=\"dateField\" was not injected: check your FXML file 'EventLayout.fxml'.";
		assert organizatorField != null : "fx:id=\"organizatorField\" was not injected: check your FXML file 'EventLayout.fxml'.";
		assert valueField != null : "fx:id=\"valueField\" was not injected: check your FXML file 'EventLayout.fxml'.";
		assert addressField != null : "fx:id=\"addressField\" was not injected: check your FXML file 'EventLayout.fxml'.";
		assert descArea != null : "fx:id=\"descArea\" was not injected: check your FXML file 'EventLayout.fxml'.";
		assert buyButton != null : "fx:id=\"buyButton\" was not injected: check your FXML file 'EventLayout.fxml'.";
		assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'EventLayout.fxml'.";

	}
	
	public boolean fillData(Event ev) {
		try {
			System.out.println(ev.getName());
			System.out.println(titleField.getText());
			
			titleField.setText(ev.getName());
			dateField.setText(ev.getStartDate().toString());
			valueField.setText("35 PLN");
			addressField.setText(ev.getPlace());
			descArea.setText(ev.getDescription());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
