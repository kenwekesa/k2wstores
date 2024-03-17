package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Signup extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));

        Parent root = loader.getRoot();
        // Create a new Stage for the MainWindow
        Stage mainWindow = new Stage();
        mainWindow.setTitle("Signup");
        mainWindow.setScene(new Scene(root));
        mainWindow.show();

    }
}
