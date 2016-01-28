package pe.edu.upeupoo.mvc;

public class ConversorEurosPesetas extends Concersoreuros {
	
public ConversorEurosPesetas(){
	super(166.386D);
	
}
public double euroApesetas(double cantidad){
	return eurosAmonedas(cantidad);
	
} 
public double pestasAeuros(double cantidad){
	return monedaAeuros(cantidad);
}
}
