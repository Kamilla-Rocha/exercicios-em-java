package exerciciosloops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/



public class exerciciosloops04 {

	public static void main(String[] args) {
		
		int quantNumeros;
		int quantPares=0;
		int quantImpares=0;
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de numero:");
		quantNumeros=ler.nextInt();
		
		int count=0;
		do {
			System.out.println("Numero:");
			numero=ler.nextInt();
			
			if(numero%2==0) quantPares++;
			else quantImpares++;
			
		count++;
		}while(count<quantNumeros);
		
		
		System.out.println("Quantidade dos numeros par:" +quantPares);
		System.out.println("Quantidade Impar:"+ quantImpares);
		
	
	

	}

}
