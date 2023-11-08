package com.drawingapp.main;
import com.drawingapp.requests.*;
import com.drawingapp.services.*;


public class GuiceDemo {

	private static final String SQUARE_REQ = "SQUARE";
	private static void sendRequest(String squareReq) {
		
		if(squareReq.equals("SQUARE")) {
			
			DrawShape d = new DrawSquare();
			SquareRequest request = new SquareRequest(d);
			
			request.makeRequest();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sendRequest(SQUARE_REQ);

	}
	
	

}
