package org.jagan.spring;

public class Point {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void myInit() {
		System.out.println("init method called for Point");
	}
	
	public void myCleanup() {
		System.out.println("cleanup method called for Point");
	}
	
	public void mmyInit() {
		System.out.println("minit method called for Point");
	}
	
	public void mmyCleanup() {
		System.out.println("mcleanup method called for Point");
	}
}