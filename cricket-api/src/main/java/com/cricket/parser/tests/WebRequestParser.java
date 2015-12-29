package com.cricket.parser.tests;

import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.cricket.cricinfo.live.beans.RSSFeed;
import com.cricket.parser.factory.ElementParserFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WebRequestParser {

	public static void main(String[] args) throws IOException {
		String matchId = "892517";
		Document doc = Jsoup.connect("http://static.cricinfo.com/rss/livescores.xml").get();
		String selector = "channel";
		
		Elements elements = doc.select(selector);
		RSSFeed summaryBean = ElementParserFactory.getInstance().getBeanInstance(elements, RSSFeed.class);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(matchId + " Done!");
		
		PrintWriter fw = new PrintWriter(System.out);
		fw.print(gson.toJson(summaryBean));
		fw.close();


		/*System.out.println(elements.size());
		for (Element element: elements){
			System.out.println(element.text());
		}*/
	}
}
