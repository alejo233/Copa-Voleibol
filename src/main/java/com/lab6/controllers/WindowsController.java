package com.lab6.controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.lab6.model.PanAmericanCup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

public class WindowsController implements Initializable{

    @FXML
    private Button btnLoadData;

    @FXML
    private Text labMessageLoad;

    @FXML
    private Button btnSearchSpectator;

    @FXML
    private TextField txtSpectatorId;

    @FXML
    private Text labSpectatorMessage;

    @FXML
    private Label labSpectatorTime;

    @FXML
    private Button btnSearchParticipant;

    @FXML
    private Text labParticipantMessage;

    @FXML
    private Label labParticipantTime;

    @FXML
    private ImageView avatar;

    @FXML
    private Label labName;

    @FXML
    private Label labId;

    @FXML
    private Label labGender;

    @FXML
    private Label labCountry;

    @FXML
    private Label labBirthday;
    
    private PanAmericanCup panAmericanCup;

    @FXML
    void loadData(ActionEvent event) throws IOException {
    	System.out.println("Hola");
    	FileChooser fileChooser = new FileChooser();
    	File file = fileChooser.showOpenDialog(null);
    	
    	if ( file != null) {
    		panAmericanCup.loadData(file);
    	} else {
    		
    	}
    }

    @FXML
    void searchParticipant(ActionEvent event) {

    }

    @FXML
    void searchSpectator(ActionEvent event) {

    }

	public void initialize(URL location, ResourceBundle resources) {
		panAmericanCup = new PanAmericanCup();
		
		
	}

}
