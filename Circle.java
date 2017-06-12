package OOP;

public class Circle {
	private double radius;
	private String color;
public	Circle(){
		radius=5.0;
		color="red";
	}
public Circle(double r){	
	radius=r;
	
}
public double getRadius(){
	return radius;
}
public double getArea(){
	double Area=radius*radius*Math.PI;
	return Area;



}




}
