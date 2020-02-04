public class Message {
	String msg;

	public Message() {
		this.msg = "Message par defaut";
	}

	public Message(String msg) {
		this.msg = msg;
	}

	public void play() {
		System.out.println(msg);
	}
}