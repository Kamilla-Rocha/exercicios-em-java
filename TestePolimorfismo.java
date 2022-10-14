package teste;

public class TestePolimorfismo {

	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Zuleide");
		fisica.setCpf(123697559556L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Jubileu");
		juridica.setCnpj(102369745126L);
		
		Pessoa01[] pessoas = new Pessoa01[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa01 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
	}

}
