package com.cricket.parser.tests;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.cricket.cricinfo.beans.MatchBean;
import com.cricket.parser.factory.ElementParserFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WebRequestParser {

	public static void main(String[] args) throws IOException {
		String matchId = "892517";
		Document doc = Jsoup.connect("http://www.espncricinfo.com/ci/engine/match/"+matchId+".html?view=scorecard;wrappertype=none").get();
		Elements elements = doc.select("body");
		
		MatchBean mactchBean = ElementParserFactory.getInstance().getBeanInstance(elements, MatchBean.class);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(matchId + " Done!");
		
		PrintWriter fw = new PrintWriter(new FileWriter("f:/temp/"+matchId +".json"));
		fw.print(gson.toJson(mactchBean));
		fw.close();
		/*System.out.println(elements.size());
		for (Element element: elements){
			System.out.println(element.text());
		}*/
		/*
		System.out.println("-----------------");
		Elements elements1 = doc.select(".space-top-bottom-5:eq(2)");
		for (Element element: elements1){
			System.out.println(element.text());
		}*/
	}

	/*private static void printMatchInnings(MatchInningsBean beanInstance) {
		for (BattingCardBean element: beanInstance.getBatting()){
			System.out.println(ToStringBuilder.reflectionToString(element, ToStringStyle.MULTI_LINE_STYLE));
		}
		
		for (BowlingCardBean element: beanInstance.getBowling()){
			System.out.println(ToStringBuilder.reflectionToString(element, ToStringStyle.MULTI_LINE_STYLE));
		}
	}*/

}
