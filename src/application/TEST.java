package application;
import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 
 * @author Richard Colorusso
 *3/23/19
 */

public class TEST {

	public static void main(String[] args) {
		//System.out.println("Running");
		/**
		Document document;
		Document five_day;
		String zip = "";
		Scanner scan = new Scanner(System.in);
		System.out.printf("Input a zip code: ");
		zip = scan.next();

		 **/
		/**
		try {
			document = Jsoup.connect("https://weather.com/weather/today/l/"+ zip +":4:US").get();
			five_day = Jsoup.connect("https://weather.com/weather/5day/l/"+ zip +":4:US").get();
			String title = document.title();
			System.out.printf("%s%n", title);
			//Elements temp = document.select("today_nowcard-temp:contains(\u00b0)");
			Elements temp = document.select("div.today_nowcard-temp");
			Elements phrase = document.select("div.today_nowcard-phrase");
			Elements feel = document.select("div.today_nowcard-feels");
			Elements hilo = document.select("div.today_nowcard-hilo");

			//Elements day = five_day.select("span.date-time");
			Elements day = five_day.select("tr.closed.clickable:nth-of-type(1)");
			Elements day2 = five_day.select("tr.closed.clickable:nth-of-type(2)");
			Elements day3 = five_day.select("tr.closed.clickable:nth-of-type(3)");
			Elements day4 = five_day.select("tr.closed.clickable:nth-of-type(4)");
			Elements day5 = five_day.select("tr.closed.clickable:nth-of-type(5)");
			Elements day6 = five_day.select("tr.closed.clickable:nth-of-type(6)");
			//Elements fivedesc = five_day.select("td.description");
			//Elements fivetemp = five_day.select("td.temp");
			//Elements fiveprecip = five_day.select("td.precip");
			//Elements fivewind = five_day.select("td.wind");
			//Elements humid = document.select("table.today_nowcard-sidecar component panel");
		 **/
		/**		
			for (int i=0; i < temp.size(); i++) {
				System.out.println(temp.get(i).text());
				System.out.println(phrase.get(i).text());
				System.out.println(feel.get(i).text());
				System.out.println(hilo.get(i).text());
				//for(i=1; i<6; i++) {
					//System.out.println(five_day.select("tr.closed.clickable:nth-of-type("+i+")"));
				//}
				System.out.println(day.get(i).text());
				System.out.println(day2.get(i).text());
				System.out.println(day3.get(i).text());
				System.out.println(day4.get(i).text());
				System.out.println(day5.get(i).text());
				//System.out.println(day6.get(i).text());
				//System.out.println(day.get(i).text()+": "+fivedesc.get(i).text()+", "+fivetemp.get(i).text()+
						//", Precipitation: "+fiveprecip.get(i).text()+
						//", Wind: "+fivewind.get(i).text());
			}
		 **/			
		/*
			for (Element row : five_day.select(
					"table.twc-table-scroller tr")) {
				if(row.select("tr.closed.clickable:nth-of-type(2)").text().equals("")) {
					continue;
				}else {
					//String test = row.select("td.twc-sticky-col:nth-of-type(2).date-time").text();
					String test = row.select("tr.closed.clickable:nth-of-type(2).description").text();
					System.out.println(test);
				}
			}
		 */
		//System.out.println(temp.get().text);
		//System.out.println(temp);
		/**
		}catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Done"+"\u00b0");
	}
		 **/

		//String zipcode = "02115";
		Scanner scan = new Scanner(System.in);
		System.out.printf("Input a zip code: ");
		String zip = ControllerOpening.boxZip;

		WebInfo w = new WebInfo(zip);

		w.testWeb();	
		// PUT IT BACK WHEN YOU'RE DONE!!!!
		 // w.printString();
		String[] weather = w.setScene();

		//for(int z=0; z<weather.length; z++) {
		//System.out.println(weather[z]);
		//}
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

	
		return weather[19];

	}
	
}

