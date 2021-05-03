package com.ensate.chatapp.client.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.ensate.chatapp.client.App;
import com.ensate.chatapp.client.Client;

import javafx.fxml.Initializable;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
    @FXML
    private TextField accName;

    @FXML
    private PasswordField password;

    @FXML
    private void onLoginReq(ActionEvent event) throws IOException{ 
        if(Client.login(accName.getText(), password.getText())){
            App.switchScene("chatapp");
        }
    }

    @FXML
    private void onExitReq(ActionEvent event) throws IOException{
        Client.exit();
        Platform.exit();
    }

    @Override 
    public void initialize (URL url, ResourceBundle resources) {
        
    }
}
