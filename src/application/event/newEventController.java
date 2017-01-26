package application.event;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import application.login.LoginController;
import application.person.PersonLayoutController;
import data.event.EventDao;
import data.user.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class newEventController {

	private String userLogin;
	private int userID;
	
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	@FXML
	private Text scenetitle;

	@FXML
	private Text titleText;

	@FXML
	private TextField titleInput;

	@FXML
	private Text dateText;

	@FXML
	private Text errorDateFormat;

	@FXML
	private TextField dateInput;

	@FXML
	private Text ageText;

	@FXML
	private Text errorAgeFormat;

	@FXML
	private TextField ageInput;

	@FXML
	private Text descText;

	@FXML
	private TextArea descInput;

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
	private TextField placeInput;


	@FXML
	void cancelAdding(ActionEvent event) {
		Stage st = (Stage) cancelButton.getScene().getWindow();
		st.close();
	}

	@FXML
	void submitAdding(ActionEvent event) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Stage st = (Stage) cancelButton.getScene().getWindow();
		int rows = 0;

		if (isValidDate(dateInput.getText()) && isValidInteger(ageInput.getText())) {
	        
			// put data into variables:
			try {
				
				String	name = 								titleInput.getText();
				Date	startDate = 			sdf.parse(	dateInput.getText());
				int		ageRestriction = Integer.parseInt(	ageInput.getText());
				String	desc = 								descInput.getText();
				String	type = 								typeInput.getText();
				String	place = 							placeInput.getText();
				int		useriD = 							this.userID;

				data.event.Event ev = new data.event.Event(
						0, name, startDate, ageRestriction, desc, type, place, useriD);

				EventDao dao = new EventDao();
				rows = dao.insertEvent(ev);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			if(rows == 1) {
				// TODO succesfully added an event
			} else {
				// TODO error ?!
			}

			st.close();
		} else {
			// wrong date format
			if(!isValidDate(dateInput.getText())) 
				this.errorDateFormat.setVisible(true);
			else
				this.errorDateFormat.setVisible(false);

			if(!isValidInteger(ageInput.getText()))
				this.errorAgeFormat.setVisible(true);
			else
				this.errorAgeFormat.setVisible(false);

		}

	}

	public boolean isValidDate(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			sdf.parse(dateString);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	public boolean isValidInteger(String integerString) {
		try {
			Integer.parseInt(integerString);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	

	 @FXML
	    void initialize() {
	        assert scenetitle != null : "fx:id=\"scenetitle\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert titleText != null : "fx:id=\"titleText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert titleInput != null : "fx:id=\"titleInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert dateText != null : "fx:id=\"dateText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert errorDateFormat != null : "fx:id=\"errorDateFormat\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert dateInput != null : "fx:id=\"dateInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert ageText != null : "fx:id=\"ageText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert errorAgeFormat != null : "fx:id=\"errorAgeFormat\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert ageInput != null : "fx:id=\"ageInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert descText != null : "fx:id=\"descText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert descInput != null : "fx:id=\"descInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert typeText != null : "fx:id=\"typeText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert typeInput != null : "fx:id=\"typeInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert placeText != null : "fx:id=\"placeText\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'newEventLayout.fxml'.";
	        assert placeInput != null : "fx:id=\"placeInput\" was not injected: check your FXML file 'newEventLayout.fxml'.";


	    }
}
