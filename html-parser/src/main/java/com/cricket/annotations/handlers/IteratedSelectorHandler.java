package com.cricket.annotations.handlers;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.cricket.annotations.IteratedSelector;
import com.cricket.parser.factory.ElementParserFactory;

public class IteratedSelectorHandler {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<?> processAnnotation(Elements element, Field field){
		List resultList = new ArrayList();
		
		IteratedSelector textSelector = field.getAnnotation(IteratedSelector.class);
		Elements elements = element.select(textSelector.selector());
		
		ParameterizedType genericType = (ParameterizedType) field.getGenericType();
		Class<?> type = (Class<?>)genericType.getActualTypeArguments()[0];
		 
		for(Element tempElement: elements){
			Object beanInstance = ElementParserFactory.getInstance().getBeanInstance(tempElement, type);
			resultList.add(beanInstance);
		}
		return resultList;
	}
	
}
