package kr.ac.mju.dislab.java.ex11.point;

import kr.ac.mju.dislab.java.ex11.information.ClassInspector;

public class Point implements Cloneable {

	private int[] values;
	private int dim;
	
	public Point(int dim, int[] values) {
		this.dim = dim;
		this.values = new int[dim];
		
		for(int count = 0; count < dim; count++){
			setAt(count, values[count]);
		}
	}
	
	public int[] getValues() {
		return values;
	}
	
	public void showValues() {
		System.out.print("(");
		for(int count = 0; count < values.length; count++){
			if(count != values.length-1)
				System.out.print(values[count]+", ");
			else
				System.out.println(values[count]+")");
		}
	}
	
	public void setAt(int axis, int val) {
		if (this.dim >= axis)
			this.values[axis] = val;
	}

	public int getDim() {
		return dim;
	}

	public void setDim(int dim) {
		this.dim = dim;
	}
	
	public double measureDistance(Point p1, Point p2){
		double sum = 0;
		
		if(p1.getDim() != p2.getDim()){
			System.out.println("Dimension is different");
			return 0;
		} else{
			for(int count = 0; count < p1.getDim(); count++){
				sum += Math.pow(p2.getValues()[count] - p1.getValues()[count], 2);
			}
			sum = Math.sqrt(sum);
		}
		return sum;
	}

	public String toString() {
		return ClassInspector.show(this);
	}
	
	public boolean equals(Object obj){
		Point p = (Point)obj;
		if(this == p){
			return true;
		} else if(this.dim == p.getDim()){
			for(int count = 0; count < dim; count++){
				if(this.values[count] != p.getValues()[count]){
					return false;
				}
			}
			return true;
		} else{
			return false;
		}
	}
}