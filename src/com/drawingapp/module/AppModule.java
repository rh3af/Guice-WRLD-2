package com.drawingapp.module;


import com.drawingapp.services.*;
import com.drawingapp.requests.*;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind (DrawShape.class).to(DrawSquare.class); 
		
		
	}

} 
 