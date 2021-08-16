package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InputErrorController implements Initializable {

	@FXML
	Button okButton;

	private void closeButtonAction() {
		Stage stage = (Stage) okButton.getScene().getWindow();
		stage.close();
	} 

	public void initialize(URL location, ResourceBundle resources) {

		okButton.setOnAction(e -> {
			try {
				closeButtonAction();
			} catch (Exception ex) {

			}
		});
	}

}
