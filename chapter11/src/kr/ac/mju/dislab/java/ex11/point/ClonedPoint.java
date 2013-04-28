package kr.ac.mju.dislab.java.ex11.point;


public class ClonedPoint {
	
	public Point shallowClone(Point p1){
		Point p2 = p1;
		
		return p2;
	}
	
	public Point deepClone(Point p1){
		Point p2 = new Point(p1.getDim(), p1.getValues());
		
		return p2;
	}
	
	public Point moveShallowClonePoint(Point p1, int[] values){
		Point p2 = p1;
		
		if(p1.getDim() != p2.getDim()){
			System.out.println("Dimension is different");
			return null;
		} else{
			for(int count = 0; count < p2.getDim(); count++){
				p2.setAt(count, p2.getValues()[count]+values[count]);
			}
		}
		return p2;
	}
	
	public Point moveDeepClonePoint(Point p1, int[] values){
		Point p2 = new Point(p1.getDim(), p1.getValues());
		
		if(p1.getDim() != p2.getDim()){
			System.out.println("Dimension is different");
			return null;
		} else{
			for(int count = 0; count < p2.getDim(); count++){
				p2.setAt(count, p2.getValues()[count]+values[count]);
			}
		}
		return p2;
	}
}
