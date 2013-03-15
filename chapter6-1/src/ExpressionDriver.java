
public class ExpressionDriver {
	public static void main(String args[]) {
		Expression e = new OpPlus(new OpMultiply(new Constant(7), new Constant(
				2)), new OpDivide(
				new OpMinus(new Constant(3), new Constant(6)), new Constant(5)));
		System.out.println(e.calculate());
	}
}
