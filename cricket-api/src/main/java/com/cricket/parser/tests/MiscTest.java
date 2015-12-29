package com.cricket.parser.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiscTest {
	
	public static void main(String args[]){
		String regex = "(?<=\\& )\\b\\d+(\\/)*(\\d)*$";
				
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("South Africa 136/4 & 214/10 * v England 303/10 & 326/10");
		
		if(matcher.find()){
			System.out.println(matcher.group());
		}
		
	}

}
