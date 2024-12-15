package Si;

public class Condiciones5 
{
	public static void main(String[] ElPepe)
	{
		int dato;
		dato=(int)(Math.random()*2);
		System.out.println(dato);
		
		if(dato==0)
		{
			System.out.println("Cero");
		System.out.println(dato++);
		System.out.println(""+dato);
		System.out.println(dato--);
		System.out.println(" "+dato);
		}
		else
			System.out.println("Uno");
	}

}
