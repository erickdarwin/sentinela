package pe.edu.upeupoo.recuperacion;

import java.util.Scanner;

public class Pregunta1 {
public static void main(String[] args) {
	Scanner pri = new Scanner(System.in);
	System.out.println("ingrese un numero ");
	int n = pri.nextInt();

	for (int i = 1; i <= n; i++) {
		System.out.println(i * 2-1);
}
}}
