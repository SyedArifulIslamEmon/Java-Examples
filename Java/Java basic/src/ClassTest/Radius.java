package ClassTest;

public class Radius {
 private double radius;
 private String color;

 Radius(){
	 radius=1.0;
	 color="red";
	 
 }
 Radius(double radius){
	 this.radius=radius;
	 color ="red";
	 
 }
 public double getradius(){
	 return radius;
	 
 }
 public double getArea(){
	 return radius*radius*Math.PI;
	 
 }
}
