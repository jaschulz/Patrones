package ar.uba.fi.builder;

public class CocineroSalteno extends Cocinero{
	public void prepararMasa(){
		empanada.setMasa("Masa Salteña");
	}
	
	protected void saltearVegetales(){
		empanada.setRelleno("Saltear vegetales con grasa, ");
	}
	
	protected void cocinarCarne(){
		empanada.setRelleno(empanada.getRelleno() + "hervir carne, ");
	}
	
	protected void incorporarCarneAVegetales(){
		empanada.setRelleno(empanada.getRelleno() + "incorporar carne a vegetales, ");
	}

	protected void agregarIngredientesEnFrio(){
		empanada.setRelleno(empanada.getRelleno() + "finalmente agregar papa.");
	}
	
	public void rellenar(){
		empanada.setCierre("Distribuir relleno");
	}
	public void cocinar(){
		empanada.setCoccion("Freir");
	}
}
