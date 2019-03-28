import java.io.IOException;
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
	private Elements day2;
	private Elements day3;
	private Elements day4;
	private Elements day5;
	private Elements day6;
	
	
	
	public WebInfo(String zip) {
		this.zip = zip;
	}
	
	public void changeZip(String zip) {
		this.zip = zip;
	}
	
	public String toString() {
		StringBuilder test = new StringBuilder();
		for (int i=0; i < temp.size(); i++) {
			test.append(temp.get(i).text());
			test.append(phrase.get(i).text());
			test.append(feel.get(i).text());
			test.append(hilo.get(i).text());
			test.append(day.get(i).text());
			test.append(day2.get(i).text());
			test.append(day3.get(i).text());
			test.append(day4.get(i).text());
			test.append(day5.get(i).text());
		}
		return test.toString();
	}
	
	public boolean testWeb() {
		strMip test = new strMip("https://weather.com/weather/today/l/#####:4:US", "#####");
		strMip test2 = new strMip("https://weather.com/weather/5day/l/#####:4:US", "#####");
		
		test.setReplace(zip);
		test2.setReplace(zip);
		
		try {
			document = Jsoup.connect(test.toString()).get();
			five_day = Jsoup.connect(test2.toString()).get();
			String title = document.title();
			System.out.printf("%s%n", title);
			//Elements temp = document.select("today_nowcard-temp:contains(\u00b0)");
			temp = document.select("div.today_nowcard-temp");
			phrase = document.select("div.today_nowcard-phrase");
			feel = document.select("div.today_nowcard-feels");
			hilo = document.select("div.today_nowcard-hilo");
			
			//Elements day = five_day.select("span.date-time");
			day = five_day.select("tr.closed.clickable:nth-of-type(1)");
			day2 = five_day.select("tr.closed.clickable:nth-of-type(2)");
			day3 = five_day.select("tr.closed.clickable:nth-of-type(3)");
			day4 = five_day.select("tr.closed.clickable:nth-of-type(4)");
			day5 = five_day.select("tr.closed.clickable:nth-of-type(5)");
			day6 = five_day.select("tr.closed.clickable:nth-of-type(6)");
			return true;
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
}
