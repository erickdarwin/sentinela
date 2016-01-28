package pe.edu.upeupoo.mvc;

public class Concersoreuros {

	private double cambio;
	
	public Concersoreuros (double valorcambio){
		cambio=valorcambio;
	}
	public Concersoreuros(double valorcambio) {
		// TODO Auto-generated constructor stub
	}
	public double eurosAmonedas (double cantidad){
	return cantidad*cambio;	
		
	}
	public double monedaAeuros ( double cantidad){
		return cantidad/cambio;
		
	}
	

}
