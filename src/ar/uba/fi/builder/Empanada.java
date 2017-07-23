package ar.uba.fi.builder;

public class Empanada {
	private String relleno;
	private String masa;
	private String cierre;
	private String coccion;
	
	public void setRelleno(String r){
		relleno = r;
	}
	
	public String getRelleno(){
		return relleno;
	}
	
	public void setMasa(String r){
		masa = r;
	}
	
	public String getMasa(){
		return masa;
	}
	
	public void setCierre(String r){
		cierre = r;
	}
	
	public String getCierre(){
		return cierre;
	}
	
	public void setCoccion(String r){
		coccion = r;
	}
	
	public String getCoccion(){
		return coccion;
	}
}
