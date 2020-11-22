
public class Circle {
	
	public double radius=1; //default radius value
	
	//constructor
	Circle(){
		
	}
	//constructor
 Circle(double newRadius) {
	radius = newRadius;
}
 //calculate area of circle
 public double getArea() {
	 
	 
	 return radius * radius * Math.PI;
	 
 }
//calculate perimeter of circle
 public double getPerimeter() {
	 
 return 2*radius*Math.PI;
 
}
 //set radius
 public void setRadius(double newRadius) {
	 
	 radius=newRadius;
 }
 
}
