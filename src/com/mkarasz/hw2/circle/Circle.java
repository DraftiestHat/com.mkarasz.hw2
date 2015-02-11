/**
 * MY GOD DOES THIS NEED COMMENTS.
 */
package com.mkarasz.hw2.circle;



public class Circle {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	double x;
	double y;
	double radius;
	
	public Circle(){
		this.x = 1;
		this.y = 1;
		this.radius = 1;
	}
	
	public Circle(double radius){
		this.x = radius;
		this.y = radius;
		this.radius = radius;
	}
	
	public Circle(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area(){
		return Math.PI * this.radius * this.radius;
	}
	
	public double perimeter(){
		return 2 * Math.PI * this.radius;
	}
	
	public double distanceFromOrigin(){
		return Math.sqrt(Math.pow(this.x + this.radius, 2) + Math.pow(this.y + this.radius, 2));
	}
	
	public void draw(){		
		//double x = this.x; 
		
		for (int i = 0; i <= 2*this.x; i++){
	        for (int j = 0; j <= 2*this.y; j++){
	            double dx = (x - i);
	            double dy = (y - j);

	            if (Math.abs(dx*dx + dy*dy - radius*radius) < 5){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
		
		
	}
	
	/*public void draw(){
		JFrame f = new JFrame();
		f.setBounds(300,300,300,300);
		f.getContentPane().add(this);
		f.setVisible(true);
	}
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(new Ellipse2D.Double(this.x, this.y, this.radius * 2, this.radius * 2));
	}*/
	
}
