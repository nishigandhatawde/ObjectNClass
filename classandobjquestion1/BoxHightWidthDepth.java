package com.classandobjquestion1;
//Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.

//The dimensions of the Box are width, height, depth.

//The class should have a method that can return the volume of the box.

//Create an object of the Box class and test the functionalities.
public class BoxHightWidthDepth {

	int height;
	int width;
	int depth;
	
	public BoxHightWidthDepth(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	

//	@Override
//	public String toString() {
//		return "BoxHightWidthDepth [height=" + height + ", width=" + width + ", depth=" + depth + "]";
//	}

	public int getVolume() {
		int volume=height*width*depth;
		return volume;
		
	}
	
	
	
}

