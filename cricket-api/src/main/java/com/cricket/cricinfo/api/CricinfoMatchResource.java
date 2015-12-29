package com.cricket.cricinfo.api;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.cricket.cricinfo.beans.MatchBean;
import com.cricket.cricinfo.live.beans.MatchRSSItem;
import com.cricket.cricinfo.live.beans.RSSFeed;
import com.cricket.parser.factory.ElementParserFactory;

@Path("/match")
public class CricinfoMatchResource {
	private static final String CRICINFO_MATCH_URL = "http://www.espncricinfo.com/ci/engine/match/%s.html?view=scorecard;wrappertype=none";
	
	private static final String CRICINFO_LIVE_MATCHES_URL = "http://static.cricinfo.com/rss/livescores.xml";
	
	@GET
	@Path("{matchId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MatchBean getMatchDetails(@PathParam("matchId") String matchId) {
		MatchBean mactchBean = null;

		try {
			Document doc = Jsoup.connect(String.format(CRICINFO_MATCH_URL, matchId)).get();
			Elements elements = doc.select("body");
			
			mactchBean = ElementParserFactory.getInstance().getBeanInstance(elements, MatchBean.class);
		} catch (IOException e) {
			throw new NotFoundException(e.getMessage());
		}
		return mactchBean;
	}
	
	@GET
	@Path("live")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MatchRSSItem> getMatchDetails() {
		List<MatchRSSItem> items = Collections.emptyList();

		try {
			Document doc = Jsoup.connect(CRICINFO_LIVE_MATCHES_URL).get();
			Elements elements = doc.select("channel");
			
			RSSFeed feed = ElementParserFactory.getInstance().getBeanInstance(elements, RSSFeed.class);
			items = feed.getItems();
		} catch (IOException e) {
			throw new NotFoundException(e.getMessage());
		}
		return items;
	}
}
