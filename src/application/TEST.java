package application;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 
 * @author Richard Colorusso 3/23/19
 */

public class TEST {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Input a zip code: ");
		String zip = ControllerOpening.boxZip;
 
		WebInfo w = new WebInfo(zip);

		w.testWeb();
		// PUT IT BACK WHEN YOU'RE DONE!!!!
		// w.printString();
		String[] weather = w.setScene();

		// for(int z=0; z<weather.length; z++) {
		// System.out.println(weather[z]);
		// }
		System.out.println(weather[0]);

	}

	public static String currentlocation() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[0];
	}

	public static String currenttemp() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[1];
	}

	public static String currentcondos() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[2];

	}

	public static String day() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[5];

	}

	public static String dayTEMP() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[6];

	}

	public static String day2() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[7];

	}

	public static String dayTEMP2() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[8];

	}

	public static String day3() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[9];

	}

	public static String dayTEMP3() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[10];

	}

	public static String day4() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[11];

	}

	public static String dayTEMP4() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[12];

	}

	public static String day5() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[13];

	}

	public static String dayTEMP5() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[14];

	}

	public static String dayCONDO() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[15];

	}

	public static String day2CONDO() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[16];

	}

	public static String day3CONDO() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[17];

	}

	public static String day4CONDO() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		return weather[18];

	}

	public static String day5CONDO() {
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();

		String[] weather = w.setScene();

		// Final Element in the array
		return weather[19];

	}

}
