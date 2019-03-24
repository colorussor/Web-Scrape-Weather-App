import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TEST {

	public static void main(String[] args) {
		//System.out.println("Running");
		Document document;
		Document five_day;
		String zip = "";
		Scanner scan = new Scanner(System.in);
		System.out.printf("Input a zip code: ");
		zip = scan.next();
		
		
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
			//Elements day6 = five_day.select("tr.closed.clickable:nth-of-type(6)");
			//Elements fivedesc = five_day.select("td.description");
			//Elements fivetemp = five_day.select("td.temp");
			//Elements fiveprecip = five_day.select("td.precip");
			//Elements fivewind = five_day.select("td.wind");
			//Elements humid = document.select("table.today_nowcard-sidecar component panel");

			
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
		}catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Done"+"\u00b0");
	}

}
