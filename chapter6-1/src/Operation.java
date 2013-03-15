abstract class Operation extends Expression {
	Expression e1;
	Expression e2;

	Operation(Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;

	}

	abstract double calculate();

}