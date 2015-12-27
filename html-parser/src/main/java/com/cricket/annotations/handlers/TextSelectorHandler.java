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
		String returnValue = determineTextValue(elements, textSelector);
		return filterByRegex(textSelector, returnValue);
	}

	private String determineTextValue(Elements elements, TextSelector textSelector) {
		String returnValue = StringUtils.EMPTY;
		
		Elements tempElements = elements;
		if(StringUtils.isNotEmpty(textSelector.selector())){
			tempElements = elements.select(textSelector.selector());
		}

		if(CollectionUtils.isNotEmpty(tempElements)){
			returnValue = tempElements.get(0).text();
		}
		return StringEscapeUtils.escapeHtml4(returnValue);
	}
	
	private String filterByRegex(TextSelector textSelector, String returnValue) {
		String regexResult = returnValue;
		
		if(StringUtils.isNotBlank(textSelector.regex())){
			Pattern pattern = Pattern.compile(textSelector.regex());
			Matcher matcher = pattern.matcher(returnValue);
			
			if(matcher.find()){
				regexResult = matcher.group();
			}
		}
		return regexResult;
	}
	
}
