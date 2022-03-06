package ca.uwaterloo.cs446.designpatterns.observer;

public class OctObserver extends Observer {
	private String octValue;
	
	public OctObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
		octValue = null;
	}
	
	@Override
	public void update() {
		octValue = Integer.toOctalString(subject.getState());
	}

	@Override
	public String getValue() {
		return octValue;
	}
}
