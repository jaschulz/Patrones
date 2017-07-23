package ar.uba.fi.facadeAndAdapter;

import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Duck> duckList = new ArrayList<Duck>();
		
		Duck mDuck = new MallardDuck();
		Duck tAdapter = new TurkeyAdapter(new WildTurkey());
		duckList.add(mDuck);
		duckList.add(tAdapter);
		for (Duck duck : duckList) {
			duck.fly();
			duck.quack();
		}
		System.out.println("And now, they are gonna sing...");
		Orchestra o = new Orchestra(mDuck, tAdapter);
		o.sing();
		

	}

}
