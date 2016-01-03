package com.cricket.parser.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiscTest {
	
	public static void main(String args[]){
		String regex = "\\d+(\\/)*\\d*[\\s\\*]*(?=\\&|v)";
				
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("Chilaw Marians Cricket Club v Saracens Sports Club 252/7 *");
		
		if(matcher.find()){
			System.out.println(matcher.group());
		}
		
	}

}
