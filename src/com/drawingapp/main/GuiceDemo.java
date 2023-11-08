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

			SquareRequest request1 = injector.getInstance(SquareRequest.class); 
			request1.makeRequest();
			
<<<<<<< Updated upstream
			 
			/*SquareRequest request = new SquareRequest(d);*/// Not just the dependent class we can comment out the request class as well and get injector to make it automate
			 SquareRequest request = injector.getInstance(SquareRequest.class); 
			
			request.makeRequest();
=======
			SquareRequest request2 = injector.getInstance(SquareRequest.class); 
			request2.makeRequest();
		
			 boolean compareGetDrawShape = request1.getDrawShape() == request2.getDrawShape();
			 System.out.println("Are the drawShape objects equal? " + compareGetDrawShape);
			
			 boolean compareSquareRequest = request1 == request2;
			 System.out.println("Are the SquareRequest objects equal? " + compareSquareRequest);
>>>>>>> Stashed changes
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sendRequest(SQUARE_REQ);

	}
	
	

}
