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
	protected static void texttest() {
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	public void start(Stage arg0) throws Exception {
		
		WebInfo w=new WebInfo("02324");
		String[] test=w.setScene();
		String pleasework="";
		Text text=new Text();
		
		text.setX(50);
		text.setY(50);
		Group root=new Group(text);
		Scene scene=new Scene(root,100,100);
		Stage stage=new Stage();
		stage.setScene(scene);
		stage.show();


	}
	public static void main(String[] args) {
		launch(args);
	}
	
	public static  void test() {
			
	}
}
