package application.register;

import java.sql.Date;

import data.company.CompanyDao;
import data.person.PersonDao;
import data.user.UserDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    void registerCompany(ActionEvent event) {
    	String login = cLoginField.getText();
    	String password = cPasswordField.getText();
    	String type = "FIRMA";
    	String name = nameField.getText();
    	String address = cAdressField.getText();
    	String nip = nipField.getText();
    	
    	new CompanyDao().registerCompany(login, password, type, name, address, nip);
    }
    
    @FXML
    void registerPerson(ActionEvent event) {
    	String login = pLoginField.getText();
    	String password = pPasswordField.getText();
    	String type = "OSOBA";
    	String firstName = firstNameField.getText();
    	String lastName = lastNameField.getText();
    	Date dateOfBirth = Date.valueOf(dateOfBirthField.getValue());
    	String address = pAdressField.getText();
    	String pesel = peselField.getText();
    	
    	new PersonDao().registerPerson(login, password, type, firstName, lastName, dateOfBirth, address, pesel);
    }


}