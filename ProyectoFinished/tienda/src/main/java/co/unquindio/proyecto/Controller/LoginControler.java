package co.unquindio.proyecto.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginControler {
    private String nombreUsuario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label home;

    @FXML
    private PasswordField passwordTxtField;

    @FXML
    private Button start;

    @FXML
    private TextField userTxtField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void startAction(ActionEvent event) throws IOException {
        
        String usernName = userTxtField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("factura.fxml"));
        root = loader.load();

        FacturaControler controler2 = loader.getController();
        controler2.displayName(usernName);
    }

    @FXML
    void initialize() {
        assert home != null : "fx:id=\"home\" was not injected: check your FXML file 'login.fxml'.";
        assert passwordTxtField != null
                : "fx:id=\"passwordTxtField\" was not injected: check your FXML file 'login.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'login.fxml'.";
        assert userTxtField != null : "fx:id=\"userTxtField\" was not injected: check your FXML file 'login.fxml'.";

    }
}
