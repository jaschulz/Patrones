package ar.uba.fi.state;

public class LowSpeedState implements State {
	Fan fan;
	
	public LowSpeedState(Fan fan) {
		this.fan = fan;
	}

	public void pull(){
		System.out.println("Low Speed");
		fan.setState(fan.getMediumState());
	}
}
