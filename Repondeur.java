public class Repondeur {
	private Message annonce;

	public void configurerAnnonce(Message msg) {
		this.annonce = msg;
	}

	public void ecouterAnnonce() throws IllegalArgumentException {
		if (this.annonce == null) {
			throw new IllegalArgumentException();
		} 
		this.annonce.play();
	}

	public void clearAnnonce() {
		this.annonce = null;
	}
}