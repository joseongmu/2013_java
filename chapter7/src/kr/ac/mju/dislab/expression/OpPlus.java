package kr.ac.mju.dislab.expression;
public class OpPlus extends Operator {

	public OpPlus(Expression a, Expression b) {
		super(a, b);
	}

	public float calculate() {
		return a.calculate() + b.calculate();
	}

}


