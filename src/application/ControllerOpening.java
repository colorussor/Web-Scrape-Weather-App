package application;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControllerOpening implements Initializable {

	// **************This is the String that is used for the zipcode
	// **************like "02115" from the box.
	public static String boxZip = "";
	@FXML
	Hyperlink link=new Hyperlink("www.weather.com");
	// the "Go" button for the opening fxml file..
	@FXML
	Button goButton;
	// Zipcode text field
	@FXML
	TextField zip;
	@FXML
	AnchorPane AnchorOpen;
	@FXML
	Text hyperlink=new Text();
	@FXML
	// this is a method that will close ANY pane when called
	private void closeButtonAction() {
		Stage stage = (Stage) goButton.getScene().getWindow();
		stage.close();
	}

	private String getText() {
		String zipcode = zip.getText();
		return zipcode;
	}

	public ControllerOpening() {

	}

	// This is the "getter" for the zip code put in the box, which we called
	// "boxZip"
	public String getZip() {
		return boxZip;
	}

	public void initialize(URL location, ResourceBundle resources) {
		// Pretty easy to understand, when you click the gobutton it opens the main
		// application.
		
		link.setOnMouseClicked(e ->{
			try {
			Desktop.getDesktop().browse(new URI("http://www.weather.com"));
			}catch (Exception ex) {
				
			}
		});
		goButton.setOnAction(e -> {
			try {
				// **************************************
				// boxZip is the zipcode put into the box
				// **************************************
				boxZip = getText();
				if (boxZip.length() <= 6 && boxZip.length() >= 5 && boxZip.matches("[0-9]+") || boxZip.matches("1")) {
					closeButtonAction();
					Parent root2 = FXMLLoader
							.load(getClass().getClassLoader().getResource("application/WeatherAppTest.fxml"));
					Scene scene2 = new Scene(root2);
					Stage stage = new Stage();
					stage.setResizable(false);
					stage.getIcons().add(new Image("/application/istockphoto-815989290-612x612.jpg"));
					stage.setTitle("Light Skies");
					stage.setScene(scene2);
					stage.show();
				} else {
					Parent errorinput = FXMLLoader
							.load(getClass().getClassLoader().getResource("application/InputError.fxml"));
					Scene scene2 = new Scene(errorinput);
					Stage stage = new Stage();
					stage.setResizable(false);
					stage.setTitle("Light Skies");
					stage.getIcons().add(new Image("/application/istockphoto-815989290-612x612.jpg"));
					stage.setScene(scene2);
					stage.show();

				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});
		// Zip is the text field, when the user hits enter it closes the pane and opens
		// the main one. I need to change it so it will only close if a valid zipcode is
		// entered
		zip.setOnKeyPressed(ex -> {
			try {
				boxZip = getText();
				if (ex.getCode() == KeyCode.ENTER) {
					if (boxZip.length() <= 6 && boxZip.length() >= 5 && boxZip.matches("[0-9]+")
							|| boxZip.matches("1")) {
						closeButtonAction();
						Parent root2 = FXMLLoader
								.load(getClass().getClassLoader().getResource("application/WeatherAppTest.fxml"));
						Scene scene2 = new Scene(root2);
						Stage stage = new Stage();
						stage.setResizable(false);
						stage.setTitle("Light Skies");
						stage.getIcons().add(new Image("/application/istockphoto-815989290-612x612.jpg"));
						stage.setScene(scene2);
						stage.show();
					} else {
						Parent errorinput = FXMLLoader
								.load(getClass().getClassLoader().getResource("application/InputError.fxml"));
						Scene scene2 = new Scene(errorinput);
						Stage stage = new Stage();
						stage.setResizable(false);
						stage.setTitle("Light Skies");
						stage.getIcons().add(new Image("/application/istockphoto-815989290-612x612.jpg"));
						stage.setScene(scene2);
						stage.show();
					}
				}
			} catch (Exception exe) {
				// a
				exe.printStackTrace();

			}
		});

	}

}
