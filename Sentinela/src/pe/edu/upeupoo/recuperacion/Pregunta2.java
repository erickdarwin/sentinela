package pe.edu.upeupoo.recuperacion;

import java.util.Scanner;

public class Pregunta2 {
public static void main(String[] args) {
	
	Scanner seg = new Scanner(System.in);
	System.out.println("ingrese un numero");
	int num ,i,n=4, conta=2;
	String cad ="";
	int nu = seg.nextInt();
	

	for (int i = 1; i <= n; i=i%1) {
		if (n % i ==0){
			i=n;
		}
		
		System.out.println(i * 2);
}
}
}