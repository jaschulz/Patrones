package ar.uba.fi.builder;

public abstract class Cocinero {

	protected Empanada empanada;
	
	public Empanada getEmpanada() {
		return empanada;
	}


	public void createNewEmpanadaProduct(){
		empanada = new Empanada();
	}
	
	public abstract void prepararMasa();
	
	public void prepararRelleno(){
		saltearVegetales();
		cocinarCarne();
		incorporarCarneAVegetales();
		condimentar();
		agregarIngredientesEnFrio();
	}
	
	protected abstract void saltearVegetales();
	
	protected abstract void cocinarCarne();
	
	protected abstract void incorporarCarneAVegetales();
	
	protected void condimentar(){
		empanada.setRelleno(empanada.getRelleno() + "condimentar a gusto, ");
	}
	
	protected abstract void agregarIngredientesEnFrio();	
	
	public abstract void rellenar();
	
	public abstract void cocinar();
	
	public void printReceta(){
		System.out.println(empanada.getMasa());
		System.out.println(empanada.getRelleno());
		System.out.println(empanada.getCierre());
		System.out.println(empanada.getCoccion());
	}
}
