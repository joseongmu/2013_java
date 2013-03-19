
public class ShapeDriver {
	public static void main(String args[]){
		Shape[] array = new Shape[3];
		array[0] = new Rectangle(5, 8,"컴퍼스");
		array[1] = new RegularTriangle(5.0, 10.0,"자");
		array[2] = new Circle(5,"컴퍼스");
		Rectangle rectangle = new Rectangle(6,10,"컴퍼스");
		for(int i=0;i<3;i++){
			System.out.println(array[i].getName());
			System.out.println(array[i].getArea());
			System.out.println(array[i].getLength());
			}
		System.out.println(rectangle.draw());
			
		
	}
	

}
