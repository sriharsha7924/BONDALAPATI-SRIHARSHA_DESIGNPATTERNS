package com.epam.designpatterns;

public class AreaOfRectangleStrategyPattern implements Strategy{
	 @Override  
	    public float calculation(float length, float breadth) {  
	        return length*breadth;  
	    }  
}
