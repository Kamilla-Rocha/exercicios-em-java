package teste;

public class funcionario01 extends Pessoa{
	private String departamento;
	
	public funcionario01(String nome,int matricula,String departamento)
	{
		super(nome,matricula);
		this.departamento=departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
	

}
