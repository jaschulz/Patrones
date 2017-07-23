package ar.uba.fi.strategy;

public abstract class Student {
	protected TestBehaviour testBehaviour;

	public void sitForTest(){
		testBehaviour.sitForTest();
	}
	
	public void setTestBehaviour(TestBehaviour tb){
		testBehaviour = tb;
	}
}
