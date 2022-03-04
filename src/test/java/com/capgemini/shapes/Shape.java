package com.capgemini.shapes;

abstract class Shape {
	   private String color = "red";
	   private boolean filled = true;

	    public Shape() {
	    }

	    public Shape(String color, boolean filled) {
	        this.color = color;
	        this.filled = filled;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public boolean isFilled(){
	        if (this.filled == true) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public void setFilled(boolean filled){
	        this.filled = filled;
	    }

	   abstract public String toString();
	}
