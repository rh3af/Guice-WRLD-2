package com.drawingapp.requests;

import com.drawingapp.services.DrawShape;
import com.google.inject.Inject;

public class SquareRequestSubClass extends SquareRequest {

	@Inject
	public SquareRequestSubClass(DrawShape d) {
		super(d);
	
	}
	 
@Override	
public void makeRequest(){
		System.out.print("Getting printed from SquareRequestSubClass\n");
		d.draw();
	}
	

}
