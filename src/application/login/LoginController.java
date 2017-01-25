/**
 * Sample Skeleton for 'loginLayout.fxml' Controller Class
 */

package application.login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.person.PersonLayoutController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML 
    private ResourceBundle resources;

    @FXML 
    private URL location;

    @FXML 
    private TextField loginField; 

    @FXML 
    private PasswordField passwordField; 

    @FXML 
    private Button registerButton; 

    @FXML 
    private Button loginButton; 

    @FXML 
    private Label errorLabel;
    
    @FXML 
    private Label infoLabel;
    
    public void setInfoLabelVisible() {
    	infoLabel.setVisible(true);
    }

    @FXML
    void loginEvent(ActionEvent event) {
    	try {
    		
    		infoLabel.setVisible(false); 
    		
    		if(new data.user.UserDao().login(loginField.getText(), passwordField.getText()) != null) {
    			
    			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/person/personLayout.fxml"));     
    			Parent mainPageParent = fxmlLoader.load();
    			
    			// creating PersonLayoutController
    			PersonLayoutController controller = fxmlLoader.<PersonLayoutController>getController();
    			
    			// setting up user in controller
    			controller.setUserLogin(loginField.getText());
    			
    			Scene mainPageScene = new Scene(mainPageParent);
    		
    			Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    			appStage.hide();
    			appStage.setScene(mainPageScene);
    			appStage.show();
    			
    		} else {
    			errorLabel.setVisible(true);
    		}
			// else show error
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void registerEvent(ActionEvent event) {
    	try {
    		    		
			Parent registerPageParent = FXMLLoader.load(
					getClass().getResource("/application/register/registerLayout.fxml"));
			Scene registerPageScene = new Scene(registerPageParent);
			Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			appStage.hide();
			appStage.setScene(registerPageScene);
			appStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'loginLayout.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'loginLayout.fxml'.";
        assert registerButton != null : "fx:id=\"registerButton\" was not injected: check your FXML file 'loginLayout.fxml'.";
        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'loginLayout.fxml'.";
        assert errorLabel != null : "fx:id=\"errorLabel\" was not injected: check your FXML file 'loginLayout.fxml'.";

    }
}
