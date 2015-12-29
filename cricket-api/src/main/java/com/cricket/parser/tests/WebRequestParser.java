package com.cricket.parser.tests;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebRequestParser {

	public static void main(String[] args) throws IOException {
		String matchId = "892517";
		Document doc = Jsoup.connect("http://www.espncricinfo.com/ci/engine/match/"+matchId+".html?view=scorecard;wrappertype=none").get();
		String selector = "table.batting-table.innings:eq(9),"+
				".more-match-stats:eq(10),table.bowling-table:eq(11)";
		
		Elements elements = doc.select(selector);
		
		
		
		/*MatchBean mactchBean = ElementParserFactory.getInstance().getBeanInstance(elements, MatchBean.class);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(matchId + " Done!");
		
		PrintWriter fw = new PrintWriter(new FileWriter("f:/temp/"+matchId +".json"));
		fw.print(gson.toJson(mactchBean));
		fw.close();*/
		System.out.println(elements.size());
		for (Element element: elements){
			System.out.println(element.text());
		}
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
