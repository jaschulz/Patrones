package ar.uba.fi.templateMethod;

public abstract class Dev {
	
	protected void plan(){
		System.out.println("Plan the project");
	}
	
	protected abstract void develop();
	
	protected abstract void commit();
	
	protected void iterate(){
		plan();
		develop();
		commit();
	}
}
