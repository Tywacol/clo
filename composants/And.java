public class And extends Porte2Entrees {
	public boolean getEtat() throws NonConnecteException {
		if (super.in1 == null || super.in2 == null) {
			throw new NonConnecteException();
		}
		return super.in1 && super.in2;
	}
}