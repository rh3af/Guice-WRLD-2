package com.drawingapp.module;


import com.drawingapp.services.*;
import com.drawingapp.annotations.*;
import com.drawingapp.requests.*;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
<<<<<<< Updated upstream
		bind (DrawShape.class).to(DrawSquare.class); 
		bind (SquareRequest.class).to(SquareRequestSubClass.class); 
		
=======
		bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON); 
		bind(String.class).annotatedWith(ColorValue.class).toInstance("Yellow");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(30);
		bind(SquareRequest.class).in(Scopes.SINGLETON); 
>>>>>>> Stashed changes
	}

} 
 