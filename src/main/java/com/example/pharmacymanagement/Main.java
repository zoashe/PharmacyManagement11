package com.example.pharmacymanagement;


import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {


        try {
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene =new Scene(root);
            scene.setFill(Color.TRANSPARENT);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            primaryStage.show();
        } catch (IOException e) {

            e.printStackTrace();
        }




    }

    public static void main(String[] args) {
        launch(args);
    }
}