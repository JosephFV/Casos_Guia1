package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el radio: ");
		float rad = sc.nextInt();
		
		float val = (float) Math.pow(rad, 2);
		float area = (float) (val * 3.1416);
		float per = (float) (rad * 3.1416 * 2);
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Área del círculo....: " + area);
		System.out.println("Perímetro...........: " + per);
		

	}

}
