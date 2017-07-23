package ar.uba.fi.strategy;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student bully = new Bully();
		bully.sitForTest();
		System.out.println("Change to Nerd Mode");
		bully.setTestBehaviour(new NerdBehaviour());
		bully.sitForTest();
	}

}
