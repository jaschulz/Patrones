package ar.uba.fi.facadeAndAdapter;

public class TurkeyAdapter implements Duck{
	Turkey turkey;
	
	public TurkeyAdapter(Turkey t){
		turkey = t;
	}
	
	public void fly(){
		turkey.fly();
	}
	
	public void quack(){
		turkey.gobble();
	}
}
