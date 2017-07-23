package ar.uba.fi.state;

public class OffState implements State {
	
	Fan fan;
	
	public OffState(Fan fan) {
		this.fan = fan;
	}
	
	
	public void pull(){
		System.out.println("Off");
		fan.setState(fan.getLowState());
	}
}
