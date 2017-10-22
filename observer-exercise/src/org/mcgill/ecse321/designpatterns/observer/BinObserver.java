package org.mcgill.ecse321.designpatterns.observer;

public class BinObserver extends Observer {
	private String binValue;
	
	public BinObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
		
		binValue = null;
	}
	
	@Override
	public void update() {
		binValue = Integer.toBinaryString(subject.getState());
	}

	@Override
	public String getValue() {
		return binValue;
	}
}