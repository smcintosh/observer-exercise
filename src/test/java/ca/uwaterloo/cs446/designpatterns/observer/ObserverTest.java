package ca.uwaterloo.cs446.designpatterns.observer;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ObserverTest {
	private Subject sub;
	private List<Observer> observers;
	
	@Before
	public void setUp() {
		sub = new NumberSubject(0);
		
		observers = new ArrayList<Observer>();
		observers.add(new HexObserver(sub));
        observers.add(new OctObserver(sub));
	}

	@Test
	public void test() {
        sub.setState(8);
        assertEquals(observers.get(0).getValue(), "8");
        assertEquals(observers.get(1).getValue(), "10");
	}
}
