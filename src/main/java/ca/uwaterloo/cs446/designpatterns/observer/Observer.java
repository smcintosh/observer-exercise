package ca.uwaterloo.cs446.designpatterns.observer;

public abstract class Observer {
	protected Subject subject;
	
	public abstract void update();
	public abstract String getValue();
}
