package org.mcgill.ecse321.designpatterns.observer;

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
        observers.add(new BinObserver(sub));
	}

	@Test
	public void test() {
        sub.setState(8);
        assertEquals(observers.get(0).getValue(), "8");
        assertEquals(observers.get(1).getValue(), "10");
        assertEquals(observers.get(2).getValue(), "1000");
	}
}