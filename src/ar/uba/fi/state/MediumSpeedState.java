package ar.uba.fi.state;

public class MediumSpeedState implements State {
	
private Fan fan;
	
	public MediumSpeedState(Fan f){
		fan = f;
	}
	
	public void pull(){
		System.out.println("Medium Speed");
		fan.setState(fan.getHighState());
	}
}
