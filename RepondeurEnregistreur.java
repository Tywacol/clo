import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public final class RepondeurEnregistreur extends Repondeur {
	List<Message> messages = new ArrayList<>();

	public void enregistrerMessage(Message msg) {
		this.messages.add(msg);
	}

	public void ecouterMessages() {
		for (Message m : messages) {
			m.play();
		}
	}

	public void clearMessages() {
		messages.clear();
	}

	public void reset() {
		this.clearAnnonce();
		this.clearMessages();
	}

}