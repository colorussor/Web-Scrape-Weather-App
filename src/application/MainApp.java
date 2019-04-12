package application;

import java.net.URL;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.GroupLayout.Alignment;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainApp extends Application implements Initializable {
	@FXML
	ImageView dayoneimage=new ImageView();
	@FXML
	ImageView daytwoimage=new ImageView();
	@FXML
	ImageView daythreeimage=new ImageView();
	@FXML
	ImageView dayfourimage=new ImageView();
	@FXML
	ImageView dayfiveimage=new ImageView();
	@FXML
	ImageView currentcondoimage=new ImageView();
	@FXML
	Text location=new Text();
	@FXML
	Text currentday=new Text();
	@FXML
	Text currentcondit=new Text();
	@FXML
	Text currenttemp=new Text();
	@FXML
	Text day1=new Text();
	@FXML
	Text day2=new Text();
	@FXML
	Text day3=new Text();
	@FXML
	Text day4=new Text();
	@FXML
	Text day5=new Text();
	@FXML
	Text day1t=new Text();
	@FXML
	Text day2t=new Text();
	@FXML	
	Text day3t=new Text();
	@FXML
	Text day4t=new Text();
	@FXML
	Text day5t=new Text();
	@FXML
	Text currenttime=new Text();
	@FXML
	AnchorPane AnchorMain;
	@FXML
	StackPane ct=new StackPane();
	@FXML
	StackPane cl=new StackPane();
	@FXML
	ImageView currentbg=new ImageView();
	DateFormat format = DateFormat.getInstance();
	protected static void texttest() {
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {        
			Calendar cal=Calendar.getInstance();
			currenttime.setText(format.format(cal.getTime()));
		}),
				new KeyFrame(Duration.seconds(1))
				);
		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();
		
		Icons icon = new Icons(6);
		Image cloudy=new Image(getClass().getResourceAsStream(icon.getImage(6)));
		Image cloudybg=new Image(getClass().getResourceAsStream(icon.getImage(1)));
		Image partcloudy=new Image(getClass().getResourceAsStream(icon.getImage(10)));
		Image fog=new Image(getClass().getResourceAsStream(icon.getImage(8)));
		Image sunnybg=new Image(getClass().getResourceAsStream(icon.getImage(5)));
		Image sunny=new Image(getClass().getResourceAsStream(icon.getImage(14)));
		Image snowbg=new Image(getClass().getResourceAsStream(icon.getImage(4)));
		Image snow=new Image(getClass().getResourceAsStream(icon.getImage(13)));
		
		String currentlocal=TEST.currentlocation();
		String currentT=TEST.currenttemp();
		String currentcond=TEST.currentcondos();
		location.setText(currentlocal);
		location.setTextAlignment(TextAlignment.CENTER);
		currenttemp.setText(currentT);
		currentcondit.setText(currentcond);
		currentcondit.setTextAlignment(TextAlignment.CENTER);
		if(currentcond.equals("Cloudy")){
			currentcondoimage.setImage(cloudy);
			currentbg.setImage(cloudybg);
		}else if(currentcond.equals("Partly Cloudy") || currentcond.equals("Mostly Cloudy")) {
			currentcondoimage.setImage(partcloudy);
			currentbg.setImage(cloudybg);
		}else if(currentcond.equals("Sunny")) {
			currentcondoimage.setImage(sunny);
			currentbg.setImage(sunnybg);
		}else if(currentcond.equals("Fog")) {
			currentcondoimage.setImage(fog);
			currentbg.setImage(cloudybg);
		}else if(currentcond.equals("Snow")) {
			currentcondoimage.setImage(snow);
			currentbg.setImage(snowbg);
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
