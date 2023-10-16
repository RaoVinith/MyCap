package com.rk;

public abstract class Figure {
	
	public double base;
	public double height;
	
	public Figure(double base,double height){
		
		this. base= base;
		this.height=height;
	}
	
	public double calculateArea() {
		return 0.5*base*height;
	}
	
	class figure1 extends Figure {
		
		double length;
		double width;
		
		public figure1 (double length,double width) {
			
			this.length=length;
			this.width=width;
			
		}
		
		public double calculateArea() {
			
			return length*width;
		}
	}
       
	
}
