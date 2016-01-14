package pe.edu.upeupoo.clase2;

import javax.crypto.Mac;

import pe.edu.upeu.poo.clase2.Repaso;
import sun.font.TrueTypeFont;
import sun.nio.cs.ext.MacThai;

public class Repaso {

	public static void main(String[] args) {
	 
		
		double masacorporal =new masal();
		double a=25;
		double b=144;
		double peso= 65,altura=1.65;

		/**
		 * suma +
		 */
		
		
		
		System.out.println(a+b); //sirve para imprimir en la consola
		System.out.println();
	
	
	
	/**
	 * and &&
	 * on ||
	 * negacion !
	 */
	
		System.out.println(!true);
	
	
	}
	
public double imc(double peso, double altura){
	return peso/Math.pow(altura,2);
	
}
}
