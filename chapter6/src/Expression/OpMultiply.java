package Expression;

public class OpMultiply extends Operation {

	public OpMultiply(Expression e1, Expression e2) {
		super(e1, e2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return e1.calculate()*e2.calculate();
	}

	
}
