package lista01;

import java.util.Scanner;

public class excercio01 {
	
	public static void main (String args[])

	{
		
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("Informe a sua idade:");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("Informe o seu nome:");
		nome=ler.nextLine();
		System.out.printf("\n Seu nome: %s",nome);
		System.out.printf("\n Sua idade: %d",idade);
		
		if(idade>=18) {
			System.out.printf("Você é maior de idade");
		}
		
		else {
			System.out.printf("Você é menor de idade");
		}
		
				
	}
	
	
}
