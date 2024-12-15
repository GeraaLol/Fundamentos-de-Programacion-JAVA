package Condiciones;

public class Condiciones16 
{
	public static void main(String[] Algo)
	{
		int tortuga, liebre;
		
		tortuga=(int)(Math.random()*100);
		liebre=(int)(Math.random()*100);
		System.out.println(tortuga);
		System.out.println(liebre);
		
		if (tortuga==liebre)
			System.out.println("Empate");
		else
		if (tortuga>liebre)
			System.out.println("Ganó tortuga");
		else
			System.out.println("Ganó Liebre");

	}

}
