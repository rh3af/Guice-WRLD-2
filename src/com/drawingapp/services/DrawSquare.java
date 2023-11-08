package com.drawingapp.services;

import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.google.inject.Inject;

public class DrawSquare implements DrawShape{

	private String Color;
	private Integer Edge;
	
	@Inject
	public DrawSquare(@ColorValue String color,@EdgeValue Integer edge) {
		super();
		Color = color;
		Edge = edge;
	}

	@Override
	public void draw() {
		System.out.print("Drawing a Square of color "+ Color + " edge size "+ Edge+"\n");
		
	}

	
}
