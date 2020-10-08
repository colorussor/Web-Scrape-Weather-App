package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebInfo {
	private Document document;
	private Document five_day;
	private String zip = "";
	private Elements temp;
	private Elements phrase;
	private Elements feel;
	private Elements hilo;
	private Elements day;
	private Elements dayTemp;
	private Elements dayCONDO;
	private Elements day2;
	private Elements dayTemp2;
	private Elements day2CONDO;
	private Elements day3;
	private Elements dayTemp3;
	private Elements day3CONDO;
	private Elements day4;
	private Elements dayTemp4;
	private Elements day4CONDO;
	private Elements day5;
	private Elements dayTemp5;
	private Elements day5CONDO;
	// private Elements day6;
	// private Elements dayTemp6;

	public WebInfo(String zip) {
		this.zip = zip;
	}

	public void changeZip(String zip) {
		this.zip = zip;
	}

	public void printString() {
		String title = document.title();
		strMip updatedTitle = new strMip(title, "Weather Forecast and Conditions - The Weather Channel | Weather.com");
		System.out.printf("%s%n", updatedTitle);
		int i = 0;
		// for (int i=0; i < temp.size(); i++) {
		System.out.println(temp.get(i).text());
		System.out.println(phrase.get(i).text());
		System.out.println(feel.get(i).text());
		System.out.println(hilo.get(i).text());
		System.out.println(day.get(i).text());
		System.out.println(day2.get(i).text());
		System.out.println(day3.get(i).text());
		System.out.println(day4.get(i).text());
		System.out.println(day5.get(i).text());
		// }
	}

	public String[] setScene() {
		// Arraylist used for storing the strings for the weather
		ArrayList<String> list = new ArrayList<String>();
		String title = document.title();
		strMip updatedTitle = new strMip(title, "Weather Forecast and Conditions - The Weather Channel | Weather.com");
		// System.out.printf("%s%n", updatedTitle);
		int i = 0;
		list.add(updatedTitle.toString()); // Index 0 is the Location and the Zip
		list.add(temp.get(i).text()); // Temperature
		list.add(phrase.get(i).text()); // Current Condition Phrase
		list.add(feel.get(i).text()); // "Feels like ______"
		list.add(hilo.get(i).text()); // High/Low temp
		list.add(day.get(i).text()); // First of the 5 day
		list.add(dayTemp.get(i).text());
		list.add(day2.get(i).text()); // Second of the 5 day
		list.add(dayTemp2.get(i).text());
		list.add(day3.get(i).text()); // Third of the 5 day
		list.add(dayTemp3.get(i).text());
		list.add(day4.get(i).text()); // Fourth of the 5 day
		list.add(dayTemp4.get(i).text());
		list.add(day5.get(i).text()); // Fifth of the 5 day
		list.add(dayTemp5.get(i).text());
		// The following are for the conditions images
		list.add(dayCONDO.get(i).text()); // 15
		list.add(day2CONDO.get(i).text()); // 16
		list.add(day3CONDO.get(i).text()); // 17
		list.add(day4CONDO.get(i).text()); // 18
		list.add(day5CONDO.get(i).text()); // 19
		// Array

		String[] weather = new String[list.size()];
		for (int x = 0; x < weather.length; x++) {
			weather[x] = list.get(x);
		}
		return weather;
	}

	public boolean testWeb() {
		strMip test = new strMip("https://weather.com/weather/today/l/#####:4:US", "#####");
		strMip test2 = new strMip("https://weather.com/weather/5day/l/#####:4:US", "#####");

		test.setReplace(zip);
		test2.setReplace(zip);

		try {
			document = Jsoup.connect(test.toString()).get();
			five_day = Jsoup.connect(test2.toString()).get();
			// Elements temp = document.select("today_nowcard-temp:contains(\u00b0)");
			//temp = document.select("div.today_nowcard-temp");
			temp = document.select("span.TemperatureValue");
			phrase = document.select("div.today_nowcard-phrase");
			feel = document.select("div.today_nowcard-feels");
			hilo = document.select("div.today_nowcard-hilo");

			// Elements day = five_day.select("span.date-time");
			day = five_day.select("td.twc-sticky-col:nth-of-type(2) > div > div > .date-time");
			dayTemp = five_day.select("tr.closed.clickable:nth-of-type(1) > .temp");
			dayCONDO = five_day.select("tr.closed.clickable:nth-of-type(1) > .description > span");
			day2 = five_day.select(
					"tr.closed.clickable:nth-of-type(2) > td.twc-sticky-col:nth-of-type(2) > div > div > .date-time");
			dayTemp2 = five_day.select("tr.closed.clickable:nth-of-type(2) > .temp");
			day2CONDO = five_day.select("tr.closed.clickable:nth-of-type(2) > .description > span");
			day3 = five_day.select(
					"tr.closed.clickable:nth-of-type(3) > td.twc-sticky-col:nth-of-type(2) > div > div > .date-time");
			dayTemp3 = five_day.select("tr.closed.clickable:nth-of-type(3) > .temp > div");
			day3CONDO = five_day.select("tr.closed.clickable:nth-of-type(3) > .description > span");
			day4 = five_day.select(
					"tr.closed.clickable:nth-of-type(4) > td.twc-sticky-col:nth-of-type(2) > div > div > .date-time");
			dayTemp4 = five_day.select("tr.closed.clickable:nth-of-type(4) > .temp > div");
			day4CONDO = five_day.select("tr.closed.clickable:nth-of-type(4) > .description > span");
			day5 = five_day.select(
					"tr.closed.clickable:nth-of-type(5) > td.twc-sticky-col:nth-of-type(2) > div > div > .date-time");
			dayTemp5 = five_day.select("tr.closed.clickable:nth-of-type(5) > .temp > div");
			day5CONDO = five_day.select("tr.closed.clickable:nth-of-type(5) > .description > span");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;

	}
}
