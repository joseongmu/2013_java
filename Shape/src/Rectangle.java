
 class Rectangle extends Polygon implements Drawable{
	 	String name = "�簢��";
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
		if(drawingTool == "��"){
		return "Ok";
		}else return "No";
	}
	

}
