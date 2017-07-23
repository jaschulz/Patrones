package ar.uba.fi.facadeAndAdapter;

public class Orchestra {
	Duck duck1;
	Duck duck2;
	
	public Orchestra(Duck d1, Duck d2){
		duck1 = d1;
		duck2 = d2;
	}
	
	public void sing(){
		for (int i = 0; i < 3; i++){
			duck1.quack();
			duck2.quack();
		}
	}
}
