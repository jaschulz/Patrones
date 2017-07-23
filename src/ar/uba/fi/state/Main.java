package ar.uba.fi.state;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fan fan = new Fan();
		for (int i = 0; i < 10; i++){
			fan.pull();
		}
	}

}
