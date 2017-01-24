package application.person;

import java.io.IOException;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Settings;

public class newEventHandler implements EventHandler<MouseEvent> {

	
	@Override
	public void handle(MouseEvent event) {
		try {
			Parent eventFormParent= FXMLLoader.load(
					getClass().getResource("/application/event/newEventLayout.fxml"));	//
			Stage stage = new Stage();
			Scene eventFormScene = new Scene(eventFormParent, Settings.EVENT_FORM_WIDTH, Settings.EVENT_FORM_HEIGHT);
			stage.setScene(eventFormScene);
			stage.show();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
