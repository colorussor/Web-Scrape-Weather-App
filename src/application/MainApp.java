package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainApp extends Application implements Initializable {
	@FXML
	ImageView dayoneimage;
	@FXML
	ImageView daytwoimage;
	@FXML
	ImageView daythreeimage;
	@FXML
	ImageView dayfourimage;
	@FXML
	ImageView dayfiveimage;
	@FXML
	ImageView currentcondoimage;
	@FXML
	Text location;
	@FXML
	Text currentday;
	@FXML
	Text currentcondit;
	@FXML
	Text currenttemp;
	@FXML
	Text day1;
	@FXML
	Text day2;
	@FXML
	Text day3;
	@FXML
	Text day4;
	@FXML
	Text day5;
	@FXML
	Text day1t;
	@FXML
	Text day2t;
	@FXML
	Text day3t;
	@FXML
	Text day4t;
	@FXML
	Text day5t;
	@FXML
	AnchorPane AnchorMain;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	public void start(Stage arg0) throws Exception {
	

	}
	public static void main(String[] args) {
		// Parent root2=FXMLLoader.load(getClass().getClassLoader().getResource("application/WeatherAppTest.fxml"));
		// Scene scene2=new Scene(root2);
		// Stage stage=new Stage();
		// stage.setScene(scene2);
		// stage.show();
	}
}
