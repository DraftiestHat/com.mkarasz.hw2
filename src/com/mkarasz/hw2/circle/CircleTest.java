package com.mkarasz.hw2.circle;


public class CircleTest {

	public static void main(String[] args) throws InterruptedException {
		Circle c = new Circle();
		
		System.out.println("Non-initialized-circle stats:");
		printStats(c);		
		c.draw();
		System.out.println();
		
		c = new Circle(5);
		
		System.out.println("Only-radius-initialized-circle stats:");
		printStats(c);
		c.draw();
		System.out.println();
		
		c = new Circle(6, 7, 4);
		System.out.println("Everything-initialized-circle stats:");
		printStats(c);
		c.draw();
		c = null;

	}
	
	public static void printStats(Circle r) {
		System.out.printf("The circle is at (%f,%f) with a radius of %f.\n", r.getX(), r.getY(), r.getRadius());
		System.out.println("The perimeter is " + r.perimeter());
		System.out.println("The area is " + r.area());
		System.out.println("The distance the circle is from the origin is " + r.distanceFromOrigin());
	}

}
