 
class RegularTriangle extends Polygon implements Drawable{
 	String name = "»ï°¢Çü";
 	String drawingTool;
	RegularTriangle(double width, double height,String drawingTool) {
		super(width, height);
		this.drawingTool = drawingTool;
		}
	double getArea(){
		return (width*height)/2.0; 
	}
	double getLength(){
	 return width*3;
	}
	 public String getName(){
		return name;
	}
	@Override
	public String draw() {
		if(drawingTool == "ÀÚ"){
		return "Ok";
		}else return "No";
	}
	

}
