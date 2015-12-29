package com.cricket.annotations.handlers;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.select.Elements;

import com.cricket.annotations.TextSelector;

public class TextSelectorHandler {
	
	public String processAnnotation(Elements elements, Field field){
		TextSelector textSelector = field.getAnnotation(TextSelector.class);
		return determineTextValue(elements, textSelector.selector(), textSelector.regex());
	}
	
	public String determineTextValue(Elements elements, String selector, String regex){
		String value = StringUtils.trim(filterByRegex(determineTextValue(elements, selector), regex));
		return StringEscapeUtils.escapeHtml4(value);
	}

	private String determineTextValue(Elements elements, String selector) {
		String returnValue = null;
		
		Elements tempElements = elements;
		if(StringUtils.isNotEmpty(selector)){
			tempElements = elements.select(selector);
		}

		if(CollectionUtils.isNotEmpty(tempElements) && StringUtils.isNotBlank(tempElements.first().text())){
			returnValue = tempElements.first().text();
		}
		return returnValue;
	}
	
	private String filterByRegex(String returnValue, String regex) {
		String regexResult = returnValue;
		
		if(StringUtils.isNotBlank(regex) && StringUtils.isNotBlank(returnValue)){
			
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(returnValue);
			
			if(matcher.find()){
				regexResult = matcher.group();
			} else {
				regexResult = null;
			}
		}
		return regexResult;
	}
	
}
