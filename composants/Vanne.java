/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Vanne extends Composant {
	
	protected Composant in;
	
	public void setIn(Composant comp) {
		
		in = comp;
		
	}

	public boolean getEtat() throws NonConnecteException {
		
		if (in == null) {
			
			throw new NonConnecteException();
			
		} else {
			
			return in.getEtat();
			
		}
	}	

	public String description() {

		String str = super.description();
		str += " in : ";

		if (in != null) {
			str += in.getId();
		} else {
			str += "non connecte";
		}

		return str;
	}
	
}