package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		//Aplicar CAST: Convertir un tipo de dato a otro
		float res1 = (int) Math.pow(5,  3);
		float res2 = (float) Math.pow(81, 1/2.0);
		float res3 = (float) Math.pow(125, 1/3.0);
		float r1 = (float) Math.pow(256, 1/4.0);
		float r2 = (float) Math.pow(25, 1/2.0);
		float res4 = r1 + r2;
		
		System.out.println(">>>> Resultados <<<<");
		System.out.println("Resultdao 1.......: " + res1);
		System.out.println("Resultado 2.......: " + res2);
		System.out.println("Resultado 3.......: " + res3);
		System.out.println("Resultado 4.......: " + res4);
	}

}
