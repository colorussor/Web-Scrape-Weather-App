package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.glass.events.KeyEvent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class Main extends Application implements Initializable {
	// the "Go" button for the opening fxml file..
	@FXML
	Button goButton;
	// Zipcode text field
	@FXML
	TextField zip;
	@FXML
	AnchorPane AnchorOpen;
	@FXML
	// this is a method that will close ANY pane when called
	private void closeButtonAction(){
		Stage stage = (Stage) goButton.getScene().getWindow();
		stage.close();
	}
	private String getText() {
		String zipcode=zip.getText();
		return zipcode;
	 }
	// This is the opening page. the one where it asks for a zipcode
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("application/Opening.fxml"));
			Scene scene=new Scene(root);
			Stage stage1=new Stage();
			stage1.setScene(scene);
			stage1.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Pretty easy to understand, when you click the gobutton it opens the main application.
		
		goButton.setOnAction(e->{
			try {
				 String text=getText();
				 if(text.length()<=6 && text.length()>=5 && text.matches("[0-9]+")) {
				closeButtonAction();
				Parent root2=FXMLLoader.load(getClass().getClassLoader().getResource("application/WeatherAppTest.fxml"));
				Scene scene2=new Scene(root2);
				Stage stage=new Stage();
				stage.setScene(scene2);
				stage.show();
			 	}else {
					System.out.print("bad ");
					System.out.println(text.length());
				 }
			} catch(Exception ex) {
				ex.printStackTrace();
			 }
		});
		// Zip is the text field, when the user hits enter it closes the pane and opens the main one. I need to change it so it will only close if a valid zipcode is entered
		zip.setOnKeyPressed( ex->{
			try {
				 String text=getText();
				if(ex.getCode()==KeyCode.ENTER) {
					 if(text.length()<=6 && text.length()>=5 && text.matches("[0-9]+")) {
						closeButtonAction();
						Parent root2=FXMLLoader.load(getClass().getClassLoader().getResource("application/WeatherAppTest.fxml"));
						Scene scene2=new Scene(root2);
						Stage stage=new Stage();
						stage.setScene(scene2);
						stage.show();
					}else {
						System.out.print("bad");
						System.out.println(text.length());
					 }
				}
			} catch(Exception exe) {
				//a
				exe.printStackTrace();

			}
		});

	}
}
