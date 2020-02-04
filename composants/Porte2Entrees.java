

public abstract class Porte2Entrees extends Porte {
	
	protected Composant in1, in2;

	public void setIn1(Composant comp) {
		
		in1 = comp;
		
	}

	public void setIn2(Composant comp) {
		
		in2 = comp;
		
	}

	public String description() {

		String str = super.description();

		str +=" in1: ";

		if (in1 != null) {
			str += in1.getId();
		} else {
			str += "non connecte ";
		}

		str += " in2: ";

		if (in2 != null) {
			str += in2.getId();
		} else {
			str += "non connecte";
		}
		return str;
	}

}
