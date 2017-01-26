package application.person;

import java.io.IOException;

import application.event.EventController;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Settings;

public class ExistingEventHandler implements EventHandler<MouseEvent> {

	data.event.Event ev;
	
	public ExistingEventHandler(data.event.Event ev) {
		this.ev = ev;
	}

	@Override
	public void handle(MouseEvent arg0) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/event/EventLayout.fxml"));
			Parent existingEventParent = loader.load();
			Stage stage = new Stage();
			
			EventController controller = loader.<EventController>getController();
			System.out.println(controller);
			
			
			
			Scene existingEventScene = new Scene(existingEventParent, Settings.EVENT_FORM_WIDTH, Settings.EVENT_FORM_HEIGHT);
			stage.setScene(existingEventScene);
			
		
			stage.show();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
