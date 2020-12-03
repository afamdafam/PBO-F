package afamdafam.Project1;

public class Circle {
	
	protected double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		this.radius = 0.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;

	}
	
	public double getArea() {
		return (this.radius*this.radius*3.14);
	}
	
	public double getCircumference() {
		return (2*this.radius*3.14);
	}
	
}
