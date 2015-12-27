package com.cricket.parser.tests;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiscTest {
	
	List<String> list;
	
	public static void main(String args[]){
		String regex = "\\d+-\\d+";
				
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("5-150 (Anderson, 35.3 ov)");
		
		if(matcher.find()){
			System.out.println(matcher.group());
		}
		
	}

}
