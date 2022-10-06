package exerciciosloops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:*/




public class exercicioloops05 {

	public static void main(String[] args) {
		
		int tabuada;
		
		Scanner ler= new Scanner (System.in);
		
		System.out.println("Tabuada:");
		tabuada=ler.nextInt();
		
		System.out.println("Tabuada:" +tabuada);
		
		
		for(int i=1;i<=10;i++) {
			System.out.println(tabuada+"x"+i+"="+(tabuada*i));
		}
		
		
		
		

	}

}
