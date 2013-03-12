package Expression;

public class OpMinus extends Operation {

	public OpMinus(Expression e1, Expression e2) {
		super(e1, e2);
		
	}

	@Override
	public double calculate() {
	
		return 	e1.calculate()-e2.calculate();
	}
	
}
