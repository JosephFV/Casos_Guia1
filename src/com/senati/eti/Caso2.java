package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Crear la instancia para el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declarar y asignar un valor a una variable
		int n = 0;
		
		
		// Lectura de la variable
		System.out.print("Ingrese un n�mero: ");
		n = sc.nextInt();
		System.out.println("");
		
		// Impresi�n del valor de la variable
		System.out.println(">>>> Valor Ingresado <<<<");
		System.out.println("");
		System.out.println(">> N�mero: " + n);
	}

}
