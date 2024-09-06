package com.example.javafxgui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.*;

public class Scene2ViewController {
    //Create Controls
    @FXML
    Button buttonReturnToMainScene;
    @FXML
    TextField textFieldPersonID, textFieldPersonAge, textFieldPersonName;
    @FXML
    Label labelOutput, labelIdOutput, labelNameOutput, labelAgeOutput;

    //when buttonSubmit is clicked, create an object of type Person and display the person to the console
    @FXML
    void onButtonSubmitClick(){
        //Create variables to hold id, age, and name given by the respective textfields
        int personID = Integer.parseInt(textFieldPersonID.getText());
        int personAge = Integer.parseInt(textFieldPersonAge.getText());
        String personName = textFieldPersonName.getText();

        //Create Person object
        Person person = new Person(personID, personAge, personName);

        //Display person object to the scene
        labelOutput.setText("Person created.");
        labelAgeOutput.setText(Integer.toString(person.getAge()));
        labelIdOutput.setText(Integer.toString(person.getId()));
        labelNameOutput.setText(person.getName());

    }

    //Return to main scene
    @FXML
    void onButtonReturnToMainSceneClick() throws Exception{
        //Return to my-first-scene-view.fxml

        int length = 200; //Length of new stage
        int width = 300; //Width of new stage

        //Set the Parent object to the new fxml file you want to change to. Be sure
        //to import javafx.scene.Parent package
        Parent newStage = FXMLLoader.load(getClass().getResource("my-first-scene-view.fxml"));
        //Set the current stage to the control that called the method (buttonScene1Click in this case).
        //Be sure to import javafx.scene.Stage package
        Stage currentStage = (Stage) buttonReturnToMainScene.getScene().getWindow();
        //Set stage title
        currentStage.setTitle("Welcome to the application!");
        //Change the current stage to the new stage and give the length and width of the stage
        currentStage.setScene(new Scene(newStage, length, width));
    }
}
