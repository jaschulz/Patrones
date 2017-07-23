package ar.uba.fi.mediator;

public interface Participant {
	public abstract void send(String message);
 
	public abstract void receive(String message);
}