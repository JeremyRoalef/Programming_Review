package com.example.javafxgui;

import javafx.fxml.FXML;

//import controls into the file
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyFirstSceneViewController {
    //Create Label object based on the objects inside of the scene
    //You must name the label based off of the fx:id set in the scene builder

    @FXML //Use before declaring an object inside of the scene
    Label labelText;

    //Create Button objects based on the objects inside of the scene
    @FXML Button buttonGoToScene1, buttonGoToScene2, buttonGoToScene3;

    //Create methods to use with the buttons in the scene
    //Method names must be named based on the "On Action" name
    //set in the scene builder. Always use @FXML before declaring method
    @FXML
    void onButtonPressMeClick(){
        //Set the text of labelText label to "You pressed the button!"
        labelText.setText("You pressed the button!");
    }
    //Use this format to change between scenes
    @FXML
    void onButtonGoToScene1Click() throws Exception{
        int length = 500; //Length of new stage
        int width = 260; //Width of new stage

        //Set the Parent object to the new fxml file you want to change to. Be sure
        //to import javafx.scene.Parent package
        Parent newStage = FXMLLoader.load(getClass().getResource("scene-1-view.fxml"));
        //Set the current stage to the control that called the method (buttonScene1Click in this case).
        //Be sure to import javafx.scene.Stage package
        Stage currentStage = (Stage) buttonGoToScene1.getScene().getWindow();
        //Set stage title
        currentStage.setTitle("Welcome to scene 1!");
        //Change the current stage to the new stage and give the length and width of the stage
        currentStage.setScene(new Scene(newStage, length, width));
    }
    @FXML
    void onButtonGoToScene2Click() throws Exception{
        int length = 260; //Length of new stage
        int width = 280; //Width of new stage

        //Set the Parent object to the new fxml file you want to change to. Be sure
        //to import javafx.scene.Parent package
        Parent newStage = FXMLLoader.load(getClass().getResource("scene-2-view.fxml"));
        //Set the current stage to the control that called the method (buttonScene1Click in this case).
        //Be sure to import javafx.scene.Stage package
        Stage currentStage = (Stage) buttonGoToScene2.getScene().getWindow();
        //Set stage title
        currentStage.setTitle("Welcome to scene 2!");
        //Change the current stage to the new stage and give the length and width of the stage
        currentStage.setScene(new Scene(newStage, length, width));
    }
}
