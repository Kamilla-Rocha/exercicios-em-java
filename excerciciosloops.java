package exerciciosloops;

import java.util.Scanner;

public class excerciciosloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		Faça um programa que leia conjuntos de dois valores,
		o primeiro representando o nome do aluno e o segundo representando a sua idade.
		(Pare o programa inserindo o valor 0 no campo nome)
		*/
		
		String nome;
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		while(true){
			System.out.println("Informe o seu nome:");
			nome= ler.next();
			
			if(nome.equals("0")) break;
			
			System.out.println("Informe sua idade:");
			idade=ler.nextInt();
			
	
			
		}
		
		System.out.println("Programa encerrado !!!");
		
		

	}

}
