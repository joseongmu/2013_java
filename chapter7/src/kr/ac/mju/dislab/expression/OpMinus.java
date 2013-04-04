package kr.ac.mju.dislab.expression;
public class OpMinus extends Operator {

	public OpMinus(Expression a, Expression b) {
		super(a, b);
	}

	public float calculate() {
		return a.calculate() - b.calculate();
	}

}
