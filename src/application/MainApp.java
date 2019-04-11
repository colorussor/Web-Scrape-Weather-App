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
	ImageView currentcondoimage=new ImageView();
	@FXML
	Text location=new Text();
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
	protected static void texttest() {
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String j="Eggs in a Basket";
		//***********BELOW is what we tried to make the location show up in the app
		//ControllerOpening JustWork = new ControllerOpening();
		//String j = JustWork.getZip();
		location.setText(j);
	}
	public void start(Stage arg0) throws Exception {
		location.setText("hello");
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	public static  void test() {
			
	}
}
