package org.jagan.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		/*
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
		reader.loadBeanDefinitions(new FileSystemResource("spring.xml"));
		*/
		
		/*
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext applicationContext = classPathXmlApplicationContext;
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();		
		classPathXmlApplicationContext.close();
		*/

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		//applicationContext.registerShutdownHook();
		
		Triangle triangle1 = (Triangle) applicationContext.getBean("triangle1");
		triangle1.draw();

		Triangle triangle2 = (Triangle) applicationContext.getBean("triangle2");
		triangle2.draw();

		Circle circle = (Circle) applicationContext.getBean("circle");
		circle.draw();
		
		Shape shape = (Shape) applicationContext.getBean("triangle1");
		shape.draw();
	
		System.out.println(applicationContext.getMessage("greeting", null, "default greeting", null));
		
		applicationContext.close();

	}

}