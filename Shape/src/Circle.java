
public class Circle extends Shape implements Drawable{
		double radius;
	 	String name = "��";
	 	String drawingTool;
		static final double PI = 3.14;
	Circle(double radius,String drawingTool){
		this.radius = radius;
		this.drawingTool = drawingTool;
	}
	@Override
	double getArea() {
		return radius*radius*PI;
	}

	@Override
	double getLength() {
		return 2*PI*radius;
	}
	@Override
	public String getName(){
		return name;
	}
	@Override
	public String draw() {
		if(drawingTool == "���۽�"){
			return "OK";
		}else return "NO";
	}

}
