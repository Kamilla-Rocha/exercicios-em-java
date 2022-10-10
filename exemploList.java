package exemplodecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploList {



	public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
		
		System.out.println("\nCrie uma lista e adicione as sete notas:");
		
		List<Double> notas= new ArrayList<>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println(notas);
		
		System.out.println("\nExiba a posicao da nota 5.0:"+notas.indexOf(5d));
		
		System.out.println("\nAdicione na Lista a nota 8.0 na posicao 4:");
		notas.add(4, 8d);
		System.out.println(notas);
		
		System.out.println("\nSubstitua a nota 5.0 pela nota 6.0:");
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);
		
		System.out.println("\n Confira se a nota 5.0 esta na lista:"+notas.contains(5d));
		
		System.out.println("\n Exiba todas as notas na ordem em que forem informados:");
		for(Double nota: notas) System.out.println(nota);
		
		System.out.println("\n Exiba  a terceira nota adicionada:" + notas.get(2));
		
		System.out.println(notas);
		
		System.out.println("\n Exiba a menor nota:" + Collections.min(notas));
		
		System.out.println("\n Exiba a maiorr nota:" + Collections.max(notas));
		
		
		System.out.println("\n Remova a nota 0:");
		notas.remove(0.00);
		System.out.println(notas);
		
		System.out.println("\n Remova a nota na posicao 0:");
		notas.remove(0);
		System.out.println(notas);
		
		
		System.out.println("\nRemova as notas menores que 7 e exiba as lista:");
		notas.iterator();
		
		Iterator<Double> iterator1=notas.iterator();
		while(iterator1.hasNext()) {
		Double next = iterator1.next();
		if(next<7)iterator1.remove();
	}
	
	System.out.println(notas);
	
		 
	System.out.println("\nConfira se a lista esta vazia:" + notas.isEmpty());	
		
		
			
		
}	
		
}

		
		



