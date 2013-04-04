package kr.ac.mju.dislab.expression;
public class OpDivide extends Operator {

	public OpDivide(Expression a, Expression b) {
		super(a, b);
	}

	public float calculate() {
		return a.calculate() / b.calculate();
	}
}
