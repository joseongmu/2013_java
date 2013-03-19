
abstract class Polygon extends Shape {
		double width;
		double height;
		String name;
		Polygon(double width,double height){
			this.width = width;
			this.height = height;
		}
		
	abstract double getArea();
	abstract double getLength();
	abstract String getName();

}
