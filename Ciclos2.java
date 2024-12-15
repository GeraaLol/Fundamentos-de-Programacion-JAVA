public class Ciclos
{
	public static void main(String[] args) 
	{
		int numero,numerob;
		//ciclo for
		for(int control=1;control<=10;control++)
			System.out.println(control);
		
		//ciclo for 2 generar 10 numeros aleatorios()*100
		
		for(int x=1;x<=10;x++)
		{
			numero=(int)(Math.random()*100);
			System.out.println(numero);
		}
		
		//30 numeros aleatorios()*100, indique si son pares o impares
		for(int numeroa=1;numeroa<=30;numeroa++)
		{
			numerob=(int)(Math.random()*100);
			System.out.println(numerob);
			if(numerob%2==0)
				System.out.println("Es par");
			else
				System.out.println("Es impar");
		}
	}

}
