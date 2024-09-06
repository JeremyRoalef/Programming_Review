package com.example.javafxgui;
//Import all controls using wildcard (*)
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*; //imports Button, TextField, Label, etc. classes
import javafx.stage.Stage;


public class Scene1ViewController {
    //Create Controls used in the scene
    @FXML
    Button buttonReturnToMainScene;
    @FXML
    Label labelUserNumberOutput, labelUserComboBoxOutput, labelCheckBoxOutput;
    @FXML
    TextField textFieldUserNumber;
    @FXML
    ComboBox<String> comboBoxItems;
    @FXML
    CheckBox checkBoxOption1,checkBoxOption2,checkBoxOption3;

    //initialize the scene's controllers (e.g. comboboxes, controller text, and so on.)
    @FXML
    public void initialize(){
        //Initialize comboBoxItems with values for the user to select from
        comboBoxItems.getItems().addAll("Red", "Green", "Blue", "Purple"); //Alternatively can use .add() to add 1 item
    }

    //Use buttonSubmitUserInput to gather user input from textFieldUserNumber control
    @FXML
    void onButtonSubmitUserInputClick(){
        //store the text in textFieldUserNumber in a variable
        //Use getText() method in TextField objects to get the text property
        double userInput = Double.parseDouble(textFieldUserNumber.getText());
        //Display the variable to the labelUserNumberOutput label
        //Use the setText() method in labels to change the text displayed in labels
        labelUserNumberOutput.setText("The number you entered is: " + Double.toString(userInput));
    }

    //Use buttonSubmitComboBox to display the chosen value of the combo box
    @FXML
    void onButtonSubmitComboBoxClick(){
        //get the value of the combo box
        String userChoice = comboBoxItems.getValue();
        //display value to the user
        labelUserComboBoxOutput.setText("You chose: " + userChoice);
    }

    //use buttonCheckBox to display the check boxes that are checked
    @FXML
    void onButtonSubmitCheckBoxClick(){
        //Display to the user the check boxes that are checked.
        //Determine which check boxes are clicked
        String message = "You chose: ";
        boolean checkBox1IsSelected = checkBoxOption1.isSelected(); //returns true/false depending if the checkbox is selected
        boolean checkBox2IsSelected = checkBoxOption2.isSelected();
        boolean checkBox3IsSelected = checkBoxOption3.isSelected();

        if (checkBox1IsSelected){
            message += "Option 1 ";
        }
        if (checkBox2IsSelected){
            message += "Option 2 ";
        }
        if (checkBox3IsSelected){
            message += "Option 3";
        }
        //set label text to the message
        labelCheckBoxOutput.setText(message);
    }

    //Change scene to main scene
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
