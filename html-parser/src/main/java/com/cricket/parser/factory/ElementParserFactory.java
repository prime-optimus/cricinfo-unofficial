package com.cricket.parser.factory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.apache.commons.collections4.CollectionUtils;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.cricket.annotations.IteratedSelector;
import com.cricket.annotations.SimpleChildSelector;
import com.cricket.annotations.TextSelector;
import com.cricket.annotations.handlers.IteratedSelectorHandler;
import com.cricket.annotations.handlers.SimpleChildSelectorHandler;
import com.cricket.annotations.handlers.TextSelectorHandler;

public class ElementParserFactory {
	
	public <T> T getBeanInstance(Elements elements, Class<T> beanClass){
		T instance = null;
		
		if (CollectionUtils.isNotEmpty(elements)){
			instance = getInstance(beanClass);
			
			for(Field field : beanClass.getDeclaredFields()){
				Annotation[] annotations = field.getAnnotations();

				if(isAnnotationType(annotations, TextSelector.class)){
					TextSelectorHandler handler = new TextSelectorHandler();
					setBeanValue(instance, field, handler.processAnnotation(elements, field));
				} else if(isAnnotationType(annotations, IteratedSelector.class)){
					IteratedSelectorHandler handler = new IteratedSelectorHandler();
					setBeanValue(instance, field, handler.processAnnotation(elements, field));
				} else if(isAnnotationType(annotations, SimpleChildSelector.class)){
					SimpleChildSelectorHandler handler = new SimpleChildSelectorHandler();
					setBeanValue(instance, field, handler.processAnnotation(elements, field));
				}
			}
		}
		return instance;
	}
	
	public <T> T getBeanInstance(Element element, Class<T> beanClass){
		Elements elements = new Elements();
		elements.add(element);
		return getBeanInstance(elements, beanClass);
	}

	private boolean isAnnotationType(Annotation[] annotations, Class<?> annotaionClass) {
		return annotations.length > 0 && annotaionClass.isAssignableFrom(annotations[0].getClass());
	}

	private <T> void setBeanValue(T instance, Field field, Object value) {
		try {
			field.setAccessible(true);
			field.set(instance, value);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	private <T> T getInstance(Class<T> beanClass) {
		T t = null;
		
		try {
			t = beanClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return t;
	}
	
	private static ElementParserFactory elementParserFactory;
	
	private ElementParserFactory(){}
	
	public static ElementParserFactory getInstance(){
		if(elementParserFactory == null){
			elementParserFactory = new ElementParserFactory();
		}
		return elementParserFactory;
	}

}
