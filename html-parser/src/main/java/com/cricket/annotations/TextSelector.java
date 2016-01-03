package com.cricket.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) 
public @interface TextSelector{
	public String selector() default "";
	
	public String attribute() default "";
	
	public String scope() default "global";
	
	public String regex() default "";
}
