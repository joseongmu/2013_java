package kr.ac.mju.dislab.expression;
public abstract class Operator implements Expression {

	protected Expression a;
	protected Expression b;

	public Operator(Expression a, Expression b) {
		this.a = a;
		this.b = b;
	}
}