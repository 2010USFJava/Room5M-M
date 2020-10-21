package com.revature.beanz;

public class Leaf {
	
	private String color;
	private String shape;
	private int size;
	
	
	public Leaf() {
		
	}
	public Leaf(String color, String shape, int size) {
			this.color=color;
			this.shape=shape;
			this.size=size;		
	}
	
	@Override
	public String toString() {
		return "Leaf [color=" + color + ", shape=" + shape + ", size=" + size + "]";
	}
			
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	

}
