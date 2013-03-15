

class OpMultiply extends Operation {

	OpMultiply(Expression e1, Expression e2) {
		super(e1, e2);
	}

	double calculate() {
		return e1.calculate() * e2.calculate();
	}

}
