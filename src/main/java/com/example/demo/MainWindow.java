package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWindow extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainwindow.fxml"));

        Parent root = loader.getRoot();
        // Create a new Stage for the MainWindow
        Stage mainWindow = new Stage();
        mainWindow.setTitle("MainWindow");
        mainWindow.setScene(new Scene(root));
        mainWindow.show();

    }
}
