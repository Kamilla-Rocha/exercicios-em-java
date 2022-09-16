package lista01;

import java.util.Scanner;

public class leiaIdade {

	public static void main(String[] args) {

	//	1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	//	dias e mostre-a expressa apenas em dias.
		
		
		int idade;
		int anos=12;
		int meses=30;
		int dias=365;
		
		
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe sua idade:");
		System.out.print("anos:");
		anos=leia.nextInt();
		
		System.out.println("sua idade em meses sera:" + meses);
		meses=leia.nextInt();
		
		System.out.println("Sua idade em dias sera:" + dias);
		dias=leia.nextInt();
		
		
		
		
		
		
		
		
		
		
		
	}

}
