package com.cricket.annotations.handlers;

import java.lang.reflect.Field;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.select.Elements;

import com.cricket.annotations.SimpleChildSelector;
import com.cricket.parser.factory.ElementParserFactory;

public class SimpleChildSelectorHandler {
	
	public Object processAnnotation(Elements elements, Field field){
		Object returnValue = null;
		
		SimpleChildSelector simpleChildSelector = field.getAnnotation(SimpleChildSelector.class);
		if(StringUtils.isNotBlank(simpleChildSelector.selector())){
			Elements selectedElements = elements.select(simpleChildSelector.selector());
			returnValue = ElementParserFactory.getInstance().getBeanInstance(selectedElements, field.getType());
		} else {
			returnValue = ElementParserFactory.getInstance().getBeanInstance(elements, field.getType());
		}
		return returnValue;
	}
}
