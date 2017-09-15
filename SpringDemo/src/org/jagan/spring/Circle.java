package org.jagan.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
//@Service
//@Repository
//@Controller
public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	//@Autowired
	//@Qualifier(value="circleRelated")
	@Resource(name="zeroPoint")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle with center point as (" + center.getX() + ", " + center.getY() + ")");
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Initializing Cirle...");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroying Cirlce...");
	}
	
}