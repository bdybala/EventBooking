package application.register;

import java.io.IOException;
import java.sql.Date;

import application.login.LoginController;
import application.person.PersonLayoutController;
import data.company.CompanyDao;
import data.person.PersonDao;
import data.user.UserDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterLayoutController {

    @FXML
    private Button pRegisterButton;

    @FXML
    private TextField peselField;

    @FXML
    private Button pCancelButton;

    @FXML
    private PasswordField pPasswordField;

    @FXML
    private TextField cLoginField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField pAdressField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField pLoginField;

    @FXML
    private PasswordField cRepeatedPasswordField;

    @FXML
    private PasswordField pRepeatedPasswordField;

    @FXML
    private PasswordField cPasswordField;

    @FXML
    private Button cRegisterButton;

    @FXML
    private Button cCancelButton;

    @FXML
    private TextField cAdressField;

    @FXML
    private DatePicker dateOfBirthField;

    @FXML
    private TextField nipField;

    @FXML
    void registerCompany(ActionEvent event) throws IOException {
    	
    	// TODO company data validation
    	
    	String login = cLoginField.getText();
    	String password = cPasswordField.getText();
    	String type = "FIRMA";
    	String name = nameField.getText();
    	String address = cAdressField.getText();
    	String nip = nipField.getText();
    	
    	new CompanyDao().registerCompany(login, password, type, name, address, nip);
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/login/loginLayout.fxml"));     
		Parent loginPageParent = fxmlLoader.load();
		LoginController controller = fxmlLoader.<LoginController>getController();
		controller.setInfoLabelVisible();
		
		Scene loginPageScene = new Scene(loginPageParent);
	
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.hide();
		appStage.setScene(loginPageScene);
		appStage.show();
    }
    
    @FXML
    void registerPerson(ActionEvent event) throws IOException {
    	
    	// TODO person data validation
    	
    	String login = pLoginField.getText();
    	String password = pPasswordField.getText();
    	String type = "OSOBA";
    	String firstName = firstNameField.getText();
    	String lastName = lastNameField.getText();
    	Date dateOfBirth = Date.valueOf(dateOfBirthField.getValue());
    	String address = pAdressField.getText();
    	String pesel = peselField.getText();
    	
    	new PersonDao().registerPerson(login, password, type, firstName, lastName, dateOfBirth, address, pesel);
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/login/loginLayout.fxml"));     
		Parent loginPageParent = fxmlLoader.load();
		LoginController controller = fxmlLoader.<LoginController>getController();
		controller.setInfoLabelVisible();
		
		Scene loginPageScene = new Scene(loginPageParent);
	
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.hide();
		appStage.setScene(loginPageScene);
		appStage.show();
    }

    @FXML
    void cancelRegistration(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/login/loginLayout.fxml"));     
		Parent loginPageParent = fxmlLoader.load();
		
		Scene loginPageScene = new Scene(loginPageParent);
	
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.hide();
		appStage.setScene(loginPageScene);
		appStage.show();
    }

}