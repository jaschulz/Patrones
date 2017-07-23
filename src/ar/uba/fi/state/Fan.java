package ar.uba.fi.state;

public class Fan {
	State currentState;
	
	public Fan(){
		currentState = new OffState(this);
	}
	
	public void pull(){
		currentState.pull();
	}
	
	public State getOffState(){
		return new OffState(this);
	}
	
	public State getLowState(){
		return new LowSpeedState(this);
	}
	
	public State getMediumState(){
		return new MediumSpeedState(this);
	}
	
	public State getHighState(){
		return new HighSpeedState(this);
	}
	
	public State getCurrentState(){
		return currentState;
	}
	
	public void setState(State s){
		currentState = s;
	}
	
}
