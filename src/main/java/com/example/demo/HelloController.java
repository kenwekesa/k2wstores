package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        //welcomeText.setText("Welcome to JavaFX Application!");

        try {
            // Load the FXML file for the NewWindow
            FXMLLoader loader = new FXMLLoader(getClass().getResource("mainwindow.fxml"));
            Parent newWindowRoot = loader.load();

            // Create a new Stage for the NewWindow
            Stage newWindowStage = new Stage();
            newWindowStage.setTitle("NewWindow");
            newWindowStage.setScene(new Scene(newWindowRoot));
            newWindowStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions (e.g., FXML file not found)
        }
    }

    @FXML
    protected void onLoginButtonClick(ActionEvent actionEvent) {
        try {
            // Load the FXML file for the NewWindow
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent newWindowRoot = loader.load();

            // Create a new Stage for the NewWindow
            Stage newWindowStage = new Stage();
            newWindowStage.setTitle("Login");
            newWindowStage.setScene(new Scene(newWindowRoot));
            newWindowStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions (e.g., FXML file not found)
        }
    }
}