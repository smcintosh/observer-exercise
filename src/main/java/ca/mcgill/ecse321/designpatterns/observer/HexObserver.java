package ca.mcgill.ecse321.designpatterns.observer;

public class HexObserver extends Observer {
	private String hexValue;
	
	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
		hexValue = null;
	}

	@Override
	public void update() {
		hexValue = Integer.toHexString(subject.getState());
	}
	
	@Override
	public String getValue() {
		return hexValue;
	}
}
