package ar.uba.fi.state;

public class HighSpeedState implements State {
	
	private Fan fan;
	
	public HighSpeedState(Fan f){
		fan = f;
	}
		
	
	public void pull(){
		System.out.println("High Speed");
		fan.setState(fan.getOffState());
		
	}
}
