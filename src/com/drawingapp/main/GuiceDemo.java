package com.drawingapp.main;
import com.drawingapp.module.AppModule;
import com.drawingapp.requests.*;
import com.drawingapp.services.*;
import com.google.inject.Guice;
import com.google.inject.Injector;


public class GuiceDemo {

	private static final String SQUARE_REQ = "SQUARE";
	private static void sendRequest(String squareReq) {
		
		if(squareReq.equals("SQUARE")) {
			 
			/*DrawShape d = new DrawSquare();*/ // to use the Guice framework, commenting the use of interface
			 Injector injector = Guice.createInjector(new AppModule()); 
			/* DrawShape d = injector.getInstance(DrawShape.class);*/
			
			 
			/*SquareRequest request = new SquareRequest(d);*/// Not just the dependent class we can comment out the request class as well and get injector to make it automate
			 SquareRequest request = injector.getInstance(SquareRequest.class); 
			
			request.makeRequest();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sendRequest(SQUARE_REQ);

	}
	
	

}
