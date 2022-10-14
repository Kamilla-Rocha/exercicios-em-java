package teste;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) {
		{
			Map<String,Aluno> mapa= new TreeMap<String,Aluno>();
		
			Aluno a= new Aluno("João da Silva","Java",9.8);
			Aluno b= new Aluno("Maria da Silva","Linux",4.8);
			Aluno c= new Aluno("Gabriel da Silva","Rede",7.8);
			Aluno d= new Aluno("Yasmin Silva","Internet",6.8);
			
			mapa.put("João da Silva", a);
			mapa.put("Maria da Silva", b);
			mapa.put("Gabriel da Silva", c);
			mapa.put("Yasmin Silva", d);
			
			System.out.println(mapa);
			System.out.println(mapa.get("Maria da Silva"));
			
			Collection<Aluno> alunos = mapa.values();
			for(Aluno e:alunos)
			{
				System.out.println(e);
			}
		}
	

}

}