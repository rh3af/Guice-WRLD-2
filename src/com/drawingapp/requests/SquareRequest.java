package com.drawingapp.requests;
import com.drawingapp.services.*;
import com.google.inject.Inject;

public class SquareRequest {
	DrawShape d;
	
	@Inject//This annotation is used here to direct the compiler to get the bound DrawSquare class according to AppModule.class
	public SquareRequest(DrawShape d){
		this.d = d;
		
	}
	
	public void makeRequest(){
		
		d.draw();
	}
	
	public DrawShape getDrawShape() {
		return d;
		
	}
	
}
