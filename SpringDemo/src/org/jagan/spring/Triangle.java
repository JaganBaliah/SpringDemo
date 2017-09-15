package org.jagan.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape,InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	@SuppressWarnings("unused")
	private ApplicationContext applicationContext;
	
	public Triangle() {
		
	}
	
	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	@Override
	public void draw(){
		System.out.println("Point A : " + pointA.getX() + " / " + pointA.getY());
		System.out.println("Point B : " + pointB.getX() + " / " + pointB.getY());
		System.out.println("Point C : " + pointC.getX() + " / " + pointC.getY());
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name is : " + name);		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;	
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean dispose method called for Triangle");
		
	}
	
	public void myInit() {
		System.out.println("init method called for Triangle");
	}
	
	public void myCleanup() {
		System.out.println("cleanup method called for Triangle");
	}
}

/*
public class Triangle {

	private String type;
	private int height;
	
	public Triangle() {
		
	}
	
	public Triangle(String type) {
		super();
		this.type = type;
	}

	public Triangle(int height) {
		super();
		this.height = height;
	}

	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}

	public void draw(){
		System.out.println(getType() + " Triangle Drawn of height " + getHeight());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
*/
/*
public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
		
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw(){
		System.out.println("Point A : " + pointA.getX() + " / " + pointA.getY());
		System.out.println("Point B : " + pointB.getX() + " / " + pointB.getY());
		System.out.println("Point C : " + pointC.getX() + " / " + pointC.getY());
	}

}
*/
/*
public class Triangle {
	
	private List<Point> points;
	
	public void draw	() {
		for(Point point : points) {
			System.out.println("Point = (" + point.getX() + ", " + point.getY() + ")");
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
}
*/

