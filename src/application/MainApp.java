package application;

import java.net.URL;
import java.time.LocalTime;
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
	Text currentcondit=new Text();
	@FXML
	Text currenttemp=new Text();
	@FXML
	Text day1=new Text();;
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
	Text currenttime=new Text();
	@FXML
	AnchorPane AnchorMain;
	protected static void texttest() {
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Icons icon = new Icons(6);
		Image cloudy=new Image(getClass().getResourceAsStream(icon.getImage(6)));
		Image partcloudy=new Image(getClass().getResourceAsStream(icon.getImage(10)));
		String currentlocal=TEST.currentlocation();
		String currentT=TEST.currenttemp();
		String currentcond=TEST.currentcondos();
		LocalTime myObj = LocalTime.now();
		String j=myObj.toString();
		currenttime.setText(j);
		//***********BELOW is what we tried to make the location show up in the app
		//ControllerOpening JustWork = new ControllerOpening();
		//String j = JustWork.getZip();
		location.setText(currentlocal);
		currenttemp.setText(currentT);
		currentcondit.setText(currentcond);
		if(currentcond.equals("Cloudy")){
			currentcondoimage.setImage(cloudy);
		}else if(currentcond.equals("Partly Cloudy") || currentcond.equals("Mostly Cloudy")) {
			currentcondoimage.setImage(partcloudy);
		}
	}
	public void start(Stage arg0) throws Exception {
		System.out.println(ControllerOpening.boxZip);
	}
	public static void main(String[] args) {
		launch(args);
	}

	public static  void test() {

	}
}
