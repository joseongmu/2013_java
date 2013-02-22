package point;
import information.ClassInformation;


public class ClonedPoint {
	
	public static void main (String args[]){
		Point obj1 = new Point(10, 10);
		Point obj2 = (Point) obj1.clone();
		ClassInformation infor = new ClassInformation(obj1);
		
		obj2.setX(50);
		obj2.setY(100);
		
		System.out.println("\n*Colne and set*");
		System.out.println("obj1 = " + obj1);
		System.out.println("obj2 = " + obj2.toString());
		System.out.println("infor.toString(): " + infor.toString());
	}
}
