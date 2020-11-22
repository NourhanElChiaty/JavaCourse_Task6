
public class Task6_1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create circle object
		Circle cicle1= new Circle();
		Circle cicle2= new Circle();
		Circle cicle3= new Circle();
		
		/*Circle cicle1= new Circle(1);
		Circle cicle2= new Circle(25);
		Circle cicle3= new Circle(125);*/
		
		//calling setRadius method and passing radius value
		cicle1.setRadius(1);
		cicle2.setRadius(25);
		cicle3.setRadius(125);
		
		//printing Area and the perimeter 
		System.out.println("The Area of Circle1 : \n"+cicle1.getArea()+"\n");
		System.out.println("The Perimeter of Circle1 : \n"+cicle1.getPerimeter()+"\n");
		
		System.out.println("The Area of Circle2 : \n"+cicle2.getArea()+"\n");
		System.out.println("The Perimeter of Circle2 : \n"+cicle2.getPerimeter()+"\n");
		
		System.out.println("The Area of Circle3 : \n"+cicle3.getArea()+"\n");
		System.out.println("The Perimeter of Circle3 : \n"+cicle3.getPerimeter()+"\n");
	}

}
