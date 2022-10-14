package teste;

import java.util.ArrayList;
import java.util.Collection;

public class Colecoes {
	
	
	
	public static void main(String args[])
	{
		Collection<String> nomes =new ArrayList();
		nomes.add("Maria");
		nomes.add("Rafael");
		nomes.add("Igor");
		nomes.add("Juliana");
		if(nomes.isEmpty())
		{
			System.out.println("Lista vazia !!");
		}
		else
		{
			System.out.println("Lista de nomes:"+nomes);
		}
		
		
	}
}
	
		
	

