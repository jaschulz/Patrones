package ar.uba.fi.builder;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Waiter waiter = new Waiter();
		Cocinero cCordobes = new CocineroCordobes();
		Cocinero cSalteno = new CocineroSalteno();
		waiter.setEmpanadaBuilder(cSalteno);
		waiter.constructEmpanada();
		System.out.println();
		waiter.setEmpanadaBuilder(cCordobes);
		waiter.constructEmpanada();
	}

}
