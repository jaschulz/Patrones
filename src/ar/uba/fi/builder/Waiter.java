package ar.uba.fi.builder;

public class Waiter {
    private Cocinero cocinero;

    public void setEmpanadaBuilder(Cocinero cocinero) {
    	this.cocinero = cocinero;
    }

    public Empanada getEmpanada() {
        return cocinero.getEmpanada();
    }

    public void constructEmpanada() {
    	cocinero.createNewEmpanadaProduct();
    	cocinero.prepararMasa();
    	cocinero.prepararRelleno();
    	cocinero.rellenar();
    	cocinero.cocinar();
    	cocinero.printReceta();
    }
}