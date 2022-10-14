package teste;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {

	public static void main(String[] args) {
		
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a= new Aluno("João da Silva","Java",9.8);
		Aluno b= new Aluno("Maria da Silva","Linux",4.8);
		Aluno c= new Aluno("Gabriel da Silva","Rede",7.8);
		Aluno d= new Aluno("Yasmin Silva","Internet",6.8);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
		
		
		
	}

}
