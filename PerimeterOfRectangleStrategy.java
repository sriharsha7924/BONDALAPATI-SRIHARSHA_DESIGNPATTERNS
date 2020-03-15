package com.epam.designpatterns;

public class PerimeterOfRectangleStrategy implements Strategy{
	 @Override  
	    public float calculation(float length, float breadth) {  
	        return 2*(length+breadth);  
	    } 
}
