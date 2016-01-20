package pe.edu.upeupoo.practicadeevaluacion;

import java.util.Scanner;

public class Primerapregunta {
	
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	
	
	System.out.println("bienvenido");
	System.out.println("Ingrese su nombre:");
	
	String nombre = scan.nextLine();
	System.out.println("Hola " + nombre);
	
	System.out.println("ingrese el monto de la venta");
	double acumulacion = scan.nextDouble();  
	 double bonus = 0;
	 if (bonus >= 0 && bonus <= 1000){
		 
		System.out.println("su valor :"+bonus+"no tiene bonificacion");
	 }else if (pro >= 1000 && pro <= 5000){
		 resultado= pro*3/100;
	 }else if (pro >= 5000 && pro <= 20000){
		 resultado=pro*3/100;
	 }else if (pro > 20000){
		 resultado=pro*3/100;
		 
		}

	 System.out.println("su valor:"+pro+"tiene bonificacion");
	
		
	 }
	
		
		
		
		
		

		
	
		
	}
	
	
}


