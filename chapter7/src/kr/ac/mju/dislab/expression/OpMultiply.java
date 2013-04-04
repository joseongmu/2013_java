package kr.ac.mju.dislab.expression;
public class OpMultiply extends Operator {

	public OpMultiply(Expression a, Expression b) {
		super(a, b);
	}

	public float calculate() {
		return a.calculate() * b.calculate();
	}

}
