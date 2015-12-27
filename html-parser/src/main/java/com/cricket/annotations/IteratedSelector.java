package com.cricket.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) 
public @interface IteratedSelector{
	public String selector() default "";
	
	public String scope() default "global";
	
	public int startIndex() default -1;
	
	public int endIndex() default -1;
}
