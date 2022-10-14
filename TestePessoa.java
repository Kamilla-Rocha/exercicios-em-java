package teste;

public class TestePessoa {
	public static void main(String args[])
	{
		Pessoa Rafael=new Pessoa("Rafael",1236);
		funcionario01 pedro = new funcionario01("Pedro",1036,"TI");
		Pessoa maria=new funcionario01("Maria",169,"desenvolvedora java");
		Pessoa jose=new Coordenador("Jose",1096,"Tecnologia da informação");
		
		System.out.println(Rafael.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
	}
		
}
