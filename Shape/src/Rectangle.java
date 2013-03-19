
 class Rectangle extends Polygon implements Drawable{
	 	String name = "사각형";
	 	String drawingTool;
	Rectangle(double width, double height, String drawingTool) {
		super(width, height);
		this.drawingTool = drawingTool;
	
	}
	@Override
	double getArea(){
		return width * height; 
	}
	@Override
	double getLength(){
		return 2*(width+height);
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String draw() {
		if(drawingTool == "자"){
		return "Ok";
		}else return "No";
	}
	

}
