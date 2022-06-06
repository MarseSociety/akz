package com.mycompany.mavenproject3;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import static javafx.print.Paper.C;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        
        Node n1 = App.getRoot().lookup("#usernameTextField");
        TextField usernameField = (TextField) n1;
        
        Node n2 = App.getRoot().lookup("#passwordTextField");
        TextField passwordField = (TextField) n2;
        
        Label access = (Label) App.getRoot().lookup("#access");
        
        System.out.println("Логин" + usernameField.getText());
        System.out.println("Пароль" + passwordField.getText());
        
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        if ((usernameField.getText()).equals("vic") && (passwordField.getText().equals("123"))) {
            access.setText("");
            App.setRoot("secondary");
        } else {
            access.setText("ACCESS DENIDE");
            System.out.println("ACCESS DENIED");
        }
        
    }
}
