package com.estructurasSelectivas.com.ejercicio9;

import java.util.Scanner;

public class Cubo_Numeros {

	public static void main(String[] args) {
		//Escriba un algoritmo dado un grupo de números naturales positivos, calcule e imprima el cubo de estos números.
		Scanner entrada = new Scanner(System.in);
		double numero = 0;
		double cubo = 0;
		System.out.println("Ingrese el número natural: ");
		numero = entrada.nextDouble();
		if((numero<0)||(numero>9)) {
			System.out.println("El número no es natural.");
		}//
		while((numero>=0)&&(numero<=9)) {
			cubo = Math.pow(numero, 3);
			System.out.printf("El cubo del número es: %.2f%n", cubo);
			System.out.println("Ingresa otro número natural: ");
			numero = entrada.nextDouble();
			if((numero<0)||(numero>9)) {
				System.out.println("El número no es natural");
			}//
		}//
	}
	//250

}
