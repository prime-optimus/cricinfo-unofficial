package com.cricket.annotations.handlers;

import java.lang.reflect.Field;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.cricket.annotations.TableTextSelector;

public class TableTextSelectorHandler {

	public String processAnnotation(Elements elements, Field field){
		String returnValue = null;
		
		Elements parents = elements.parents().select("table");
		
		TableTextSelector selector = field.getAnnotation(TableTextSelector.class);
		String index = selector.heading();
		
		Elements parentElements = parents.first().select("th");
		Elements childElements = parentElements.select(index);
		
		int currentIndex = parentElements.indexOf(childElements.first());
		if(currentIndex != -1){
			Element selectedElement = elements.select(selector.selector()).get(currentIndex + selector.adjustment());
			
			Elements selectedElements = new Elements();
			selectedElements.add(selectedElement);
			
			TextSelectorHandler handler = new TextSelectorHandler();
			returnValue = handler.determineTextValue(selectedElements, selector.selector() , selector.regex());
		}
		return returnValue;
	}
	
}
