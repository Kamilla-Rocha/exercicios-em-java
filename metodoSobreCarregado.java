package teste;

public class metodoSobreCarregado {
	
	public void testametodoSobreCarregado()
	{
		System.out.printf("Salario com argumentos inteiro:%d\n",salario(1000));
		System.out.printf("Salario em numero inteiro:%f\n",salario(7.500));
		
	}
	
	public int salario(int valorInt)
	{
		System.out.printf("Salario em numero inteiro:%d\n",valorInt);
		return valorInt*valorInt;
		
	}
	
	public double salario(double valorDouble) 
	{
		System.out.printf("Salario com argumento double:%f\n",valorDouble);
		return valorDouble *valorDouble;
		
	}
}
