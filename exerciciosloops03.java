package exerciciosloops;

import java.util.Scanner;

public class exerciciosloops03 {
	
	
	/*
	Faça um programa que leia 5 números
	e informe o maior número
	e a média desses números.
	*/

	public static void main(String[] args) {
		
	
		Scanner ler= new Scanner(System.in);
		
		int nota;
		int maior=0;
		int menor=0;
		int count=0;
		int soma=0;
		
		
		
		
		do {
			System.out.println("Informe sua nota:");
			nota=ler.nextInt();
			count = count+1;
			
			soma=soma+nota;
			
			if(nota > maior) maior=nota;
			
		}while(count < 5);
		
		System.out.println("Maior:"+maior);
		System.out.println("Media:"+ soma/5);
		

	}
		

	}


