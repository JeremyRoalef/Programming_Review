package com.example.javafxgui; //com.example is located in src/main/resources and stores all of the fxml files of the project

//Packages necessary to start a GUI project
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application { //This Class must extend the abstract Application class to run the GUI

    //public void start(Stage stage) throws IOException is used to initialize the window you want to open when the application is run
    @Override
    public void start(Stage stage) throws IOException { //start(Stage) method opens the GUI when you run the application. The stage is the GUI window
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("my-first-scene-view.fxml")); //FXMLLoader opens the FXML file (GUI window)
        Scene scene = new Scene(fxmlLoader.load(), 200, 300); //scene object is used to open the window of a given FXML file. argument 2 and 3 are the length and width of the window
        stage.setTitle("Welcome to the application!"); //The title that appears at the top of the window
        stage.setScene(scene); //Sets the scene to the given
        stage.show(); //Used to show the window to the user
    }

    public static void main(String[] args) {
        launch(); //Used to launch the GUI window
    }
}