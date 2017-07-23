package ar.uba.fi.builder;

public class CocineroCordobes extends Cocinero{
	public void prepararMasa(){
		empanada.setMasa("Masa Cordobesa");
	}
		
	protected void saltearVegetales(){
		empanada.setRelleno("Saltear vegetales con margarina, ");
	}
	
	protected void cocinarCarne(){
		empanada.setRelleno(empanada.getRelleno() + "saltear carne, ");
	}
	
	protected void incorporarCarneAVegetales(){
		empanada.setRelleno(empanada.getRelleno() + "incorporar carne a vegetales con caldo, ");
	}

	protected void agregarIngredientesEnFrio(){
		empanada.setRelleno(empanada.getRelleno() + "finalmente agregar pasas de uva.");
	}
	
	public void rellenar(){
		empanada.setCierre("Distribuir relleno y pincelar con huevo");
	}
	public void cocinar(){
		empanada.setCoccion("Llevar al horno");
	}
}
