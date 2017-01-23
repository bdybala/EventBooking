package application.person;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class PersonLayoutController implements Initializable {

	@FXML
    private TabPane tabPane;

    @FXML
    private Tab eventsTab;

    @FXML
    private VBox eventsVB;

    @FXML
    private Tab placesTab;

    @FXML
    private VBox placesVB;

    @FXML
    private Tab ticketsTab;

    @FXML
    private VBox ticketsVB;

    @FXML
    private Tab accountTab;
    
    public PersonLayoutController() {
    	
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			tabPane.getSelectionModel().select(accountTab);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		eventsTab.setOnSelectionChanged(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				if(eventsTab.isSelected()) {
					ArrayList<data.event.Event> events = data.event.EventService.getAllEvents();
					HBox 	hb = 		new HBox();
					Boolean hbIsFull = 	false;
					
					while (!events.isEmpty()) {
						hb = new HBox();
						hbIsFull = false;
						
						for(int i = 0; i < 3; i++) {
							if(!events.isEmpty()) {
								data.event.Event ev = events.remove(0);
								TilePane tile = makeTileFromEvent(ev);
								hb.getChildren().add(tile);
								
								tile.setMaxWidth(
										hb.getWidth()/3);
								HBox.setMargin(tile, new Insets(5));
							} else {
								hbIsFull = false;
								break;
							}
							hbIsFull = true;
						}
						
						if(hbIsFull)
							eventsVB.getChildren().add(hb);
						
					}
					if(hbIsFull) {
						TilePane blank = makeBlankTile();
						hb = new HBox();
						hb.getChildren().add(blank);
						eventsVB.getChildren().add(hb);
						
						blank.setMaxWidth(
								hb.getWidth()/3);
						HBox.setMargin(blank, new Insets(5));
					} else {
						TilePane blank = makeBlankTile();
						hb.getChildren().add(blank);
						eventsVB.getChildren().add(hb);
						
						blank.setMaxWidth(
								hb.getWidth()/3);
						HBox.setMargin(blank, new Insets(5));
					}
					
				} else {
					eventsVB.getChildren().clear();
				}
			}

			private TilePane makeBlankTile() {
				// TODO blank tile with EventHandler (make new event)
				TilePane blank = new TilePane();
				blank.getChildren().add(new Label("Create new event"));
				
				blank.setPadding(new Insets(10));
				blank.setStyle("-fx-border-color: black;");
				return blank;
			}

			private TilePane makeTileFromEvent(data.event.Event ev) {
				// TODO Auto-generated method stub
				TilePane tile = new TilePane();
				tile.getChildren().add(new Label(ev.getNazwa()));
				tile.getChildren().add(new Label(ev.getData().toString()));
				tile.getChildren().add(new Label(ev.getOpis()));
				
				tile.setPadding(new Insets(10));
				tile.setStyle("-fx-border-color: black;");
				return tile;
			}
		});

	}

}
