package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    ObservableList<String> chooseMemberList = FXCollections.observableArrayList("Student", "Teacher", "Admin");

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField password_field;

    @FXML
    private ChoiceBox<String> chooseMember;

    @FXML
    private TextField login_field;

    @FXML
    private Button authSignInButton;

    @FXML
    private Button loginSignUpButton;




    @FXML
    void initialize() {
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'sample.fxml'.";
        assert chooseMember != null : "fx:id=\"chooseMember\" was not injected: check your FXML file 'sample.fxml'.";
        assert login_field != null : "fx:id=\"login_field\" was not injected: check your FXML file 'sample.fxml'.";
        assert authSignInButton != null : "fx:id=\"authSignInButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert loginSignUpButton != null : "fx:id=\"loginSignUpButton\" was not injected: check your FXML file 'sample.fxml'.";
        chooseMember.setValue("Student");
        chooseMember.setItems(chooseMemberList);
    }
}
