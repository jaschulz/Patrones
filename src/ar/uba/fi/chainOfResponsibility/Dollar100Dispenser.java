package ar.uba.fi.chainOfResponsibility;

public class Dollar100Dispenser implements DispenseChain{

	DispenseChain chain;
	
	public void setNextChain(DispenseChain nextChain){
		this.chain = nextChain;
	}
	
	public void dispense(Currency cur){
		if(cur.getAmount() >= 100){
			int num = cur.getAmount()/100;
			int remainder = cur.getAmount() % 100;
			System.out.println("Dispensing "+num+" 100$ note");
			if(remainder !=0) this.chain.dispense(new Currency(remainder));
		}else{
			this.chain.dispense(cur);
		}
	}
}
