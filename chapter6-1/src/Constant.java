

class Constant extends Expression {
	double cons;

	Constant(double cons) {
		setCons(cons);
	}

	double getCons() {
		return cons;
	}

	void setCons(double cons) {
		this.cons = cons;
	}

	double calculate() {
		return cons;
	}

}
