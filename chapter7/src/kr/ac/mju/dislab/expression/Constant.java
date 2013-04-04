package kr.ac.mju.dislab.expression;
public class Constant implements Expression {
	private float n;

	public Constant(float num) {
		this.n = num;
	}

	@Override
	public float calculate() {
		return n;
	}
}

