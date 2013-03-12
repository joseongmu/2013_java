package expression;

public class Constant extends Expression {
	private double const1;
	public Constant(double const1)
	{
		setConst1(const1);
	}
	public double getConst1() {
		return const1;
	}
	public void setConst1(double const1) {
		this.const1 = const1;
	}
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return const1;
	}

}
