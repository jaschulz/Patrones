package ar.uba.fi.templateMethod;

import java.util.ArrayList;


public class DevApp {
	public static void main(String[] args) {
		Dev javaDev = new JavaDev();
		Dev netDev = new NetDev();
		ArrayList<Dev> devList = new ArrayList<Dev>();
		devList.add(javaDev);
		devList.add(netDev);
		for (Dev d : devList){
			d.iterate();
			System.out.println();
		}
	}
}
