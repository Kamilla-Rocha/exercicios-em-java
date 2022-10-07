package exerciosdio;

import java.util.Scanner;

public class exerciciosdio03 {

	public static void main(String[] args) {
		
		
		  Scanner numero = new Scanner(System.in);
	        
	        int N;

	        System.out.println("Informe o valor de N:");
	        N=numero.nextInt();
	        
	          System.out.println(somatorio(N));

	        
	    }

	    
	    static int somatorio(int numero) {
	        if (numero == 0) {
	            return 0;
	        } else {
	            return numero + somatorio(numero - 1);
	        }
	    }

		
	
		

	}


