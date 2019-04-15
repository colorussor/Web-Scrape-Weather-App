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
		Image rain=new Image(getClass().getResourceAsStream(icon.getImage(11)));
		Image rainbg=new Image(getClass().getResourceAsStream(icon.getImage(4)));
		Image thunder=new Image(getClass().getResourceAsStream(icon.getImage(15)));
		Image thunderbg=new Image(getClass().getResourceAsStream(icon.getImage(4)));
		Image wind=new Image(getClass().getResourceAsStream(icon.getImage(16)));
		Image storm=new Image(getClass().getResourceAsStream(icon.getImage(18)));
		
		String currentlocal=TEST.currentlocation();
		String currentT=TEST.currenttemp();
		String currentcond=TEST.currentcondos();
		String dayone=TEST.day();
		String dayonec=TEST.dayCONDO();
		String dayonetemp=TEST.dayTEMP();
		String daytwo=TEST.day2();
		String daytwoc=TEST.day2CONDO();
		String daytwotemp=TEST.dayTEMP2();
		String daythree=TEST.day3();
		String daythreec=TEST.day3CONDO();
		String daythreetemp=TEST.dayTEMP3();
		String dayfour=TEST.day4();
		String dayfourc=TEST.day4CONDO();
		String dayfourtemp=TEST.dayTEMP4();
		String dayfive=TEST.day5();
		String dayfivec=TEST.day5CONDO();
		String dayfivetemp=TEST.dayTEMP5();

		location.setText(currentlocal);
		location.setTextAlignment(TextAlignment.CENTER);
		day1.setText(dayone);
		day1t.setText(dayonetemp);
		day2.setText(daytwo);
		day2t.setText(daytwotemp);
		day3.setText(daythree);
		day3t.setText(daythreetemp);
		day4.setText(dayfour);
		day4t.setText(dayfourtemp);
		day5.setText(dayfive);
		day5t.setText(dayfivetemp);
		currenttemp.setText(currentT);
		currentcondit.setText(currentcond);
		currentcondit.setTextAlignment(TextAlignment.CENTER);
	

		// RAIN
		if(dayonec.contains("Rain") || dayonec.contains("Showers")) {
			dayoneimage.setImage(rain);
		}
		if(daytwoc.contains("Rain") || daytwoc.contains("Showers")) {
			daytwoimage.setImage(rain);
		}
		if(daythreec.contains("Rain") || daythreec.contains("Showers")) {
			daythreeimage.setImage(rain);
		}
		if(dayfourc.contains("Rain") || dayfourc.contains("Showers")) {
			dayfourimage.setImage(rain);
		}
		if(dayfivec.contains("Rain") || dayfivec.contains("Showers")) {
			dayfiveimage.setImage(rain);
		}

		// SUNNY
		if(dayonec.contains("Sunny") || dayonec.equals("Clear")) {
			dayoneimage.setImage(sunny);
		}
		if(daytwoc.contains("Sunny") || daytwoc.equals("Clear")) {
			daytwoimage.setImage(sunny);
		}
		if(daythreec.contains("Sunny") || daythreec.equals("Clear")) {
			daythreeimage.setImage(sunny);
		}
		if(dayfourc.contains("Sunny") || dayfourc.equals("Clear")) {
			dayfourimage.setImage(sunny);
		}
		if(dayfivec.contains("Sunny") || dayfivec.equals("Clear")) {
			dayfiveimage.setImage(sunny);
		}

		// Cloudy
		if(dayonec.contains("Partly Cloudy") || dayonec.contains("Mostly Cloudy") || dayonec.equals("Fair") || dayonec.equals("Mostly Clear")) {
			dayoneimage.setImage(partcloudy);
		}
		if(daytwoc.contains("Partly Cloudy") || daytwoc.contains("Mostly Cloudy") || daytwoc.equals("Fair") || daytwoc.equals("Mostly Clear")) {
			daytwoimage.setImage(partcloudy);
		}
		if(daythreec.contains("Partly Cloudy") || daythreec.contains("Mostly Cloudy") || daythreec.equals("Fair") || daythreec.equals("Mostly Clear")) {
			daythreeimage.setImage(partcloudy);
		}
		if(dayfourc.contains("Partly Cloudy") || dayfourc.contains("Mostly Cloudy") || dayfourc.equals("Fair") || dayfourc.equals("Mostly Clear")) {
			dayfourimage.setImage(partcloudy);
		}
		if(dayfivec.contains("Partly Cloudy") || dayfivec.contains("Mostly Cloudy") || dayfivec.equals("Fair") || dayfivec.equals("Mostly Clear")) {
			dayfiveimage.setImage(partcloudy);
		}

		if(dayonec.equals("Cloudy") || dayonec.contains("Clouds")) {
			dayoneimage.setImage(cloudy);
		}
		if(daytwoc.equals("Cloudy") || daytwoc.contains("Clouds")) {
			daytwoimage.setImage(cloudy);
		}
		if(daythreec.equals("Cloudy") || daythreec.contains("Clouds")) {
			daythreeimage.setImage(cloudy);
		}
		if(dayfourc.equals("Cloudy") || dayfourc.contains("Clouds")) {
			dayfourimage.setImage(cloudy);
		}
		if(dayfivec.equals("Cloudy") || dayfivec.contains("Clouds")) {
			dayfiveimage.setImage(cloudy);
		}
		
		if(dayonec.contains("Thunder")) {
			dayoneimage.setImage(thunder);
		}
		if(daytwoc.contains("Thunder")) {
			daytwoimage.setImage(thunder);
		}
		if(daythreec.contains("Thunder")) {
			daythreeimage.setImage(thunder);
		}
		if(dayfourc.contains("Thunder")) {
			dayfourimage.setImage(thunder);
		}
		if(dayfivec.contains("Thunder")) {
			dayfiveimage.setImage(thunder);
		}
		
		if(dayonec.contains("Snow")) {
			dayoneimage.setImage(snow);
		}
		if(daytwoc.contains("Snow")) {
			daytwoimage.setImage(snow);
		}
		if(daythreec.contains("Snow")) {
			daythreeimage.setImage(snow);
		}
		if(dayfourc.contains("Snow")) {
			dayfourimage.setImage(snow);
		}
		if(dayfivec.contains("Snow")) {
			dayfiveimage.setImage(snow);
		}
		
		if(dayonec.contains("Wind")) {
			dayoneimage.setImage(wind);
		}
		if(daytwoc.contains("Wind")) {
			daytwoimage.setImage(wind);
		}
		if(daythreec.contains("Wind")) {
			daythreeimage.setImage(wind);
		}
		if(dayfourc.contains("Wind")) {
			dayfourimage.setImage(wind);
		}
		if(dayfivec.contains("Wind")) {
			dayfiveimage.setImage(wind);
		}
		
		if(dayonec.equals("Strong Storms")) {
			dayoneimage.setImage(storm);
		}
		if(daytwoc.equals("Strong Storms")) {
			daytwoimage.setImage(storm);
		}
		if(daythreec.equals("Strong Storms")) {
			daythreeimage.setImage(storm);
		}
		if(dayfourc.equals("Strong Storms")) {
			dayfourimage.setImage(storm);
		}
		if(dayfivec.equals("Strong Storms")) {
			dayfiveimage.setImage(storm);
		}
		
		if(currentcond.contains("Snow")) {
			currentcondoimage.setImage(snow);
			currentbg.setImage(snowbg);
		}else if(currentcond.equals("Cloudy") || currentcond.contains("Clouds")){
			currentcondoimage.setImage(cloudy);
			currentbg.setImage(cloudybg);
		}else if(currentcond.equals("Partly Cloudy") || currentcond.equals("Mostly Cloudy") || currentcond.equals("Fair")) {
			currentcondoimage.setImage(partcloudy);
			currentbg.setImage(cloudybg);
		}else if(currentcond.equals("Sunny") || currentcond.equals("Clear")) {
			currentcondoimage.setImage(sunny);
			currentbg.setImage(sunnybg);
		}else if(currentcond.equals("Fog")) {
			currentcondoimage.setImage(fog);
			currentbg.setImage(cloudybg);
		}else if(currentcond.contains("Rain") || currentcond.contains("Showers")) {
			currentcondoimage.setImage(rain);
			currentbg.setImage(rainbg);
		}else if(currentcond.contains("Thunder")) {
			currentcondoimage.setImage(thunder);
			currentbg.setImage(thunderbg);
		}else if(currentcond.contains("Wind")) {
			currentcondoimage.setImage(wind);
			currentbg.setImage(cloudybg);
		}else if(currentcond.equals("Strong Storms")) {
			currentcondoimage.setImage(storm);
			currentbg.setImage(cloudybg);
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
