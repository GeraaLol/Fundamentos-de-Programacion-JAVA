package asd;

public class Condiciones15 
{
	public static void main(String[] Luz)
	{
		//%= modulo (residuo)
		int num,residuo;
		num=(int)(Math.random()*100);
		System.out.println(num);
		residuo=num%3;
		System.out.println("Resultado es.... "+residuo);
		if(residuo==0)
			System.out.println("Es Par");
		else
			System.out.println("Es Impar");
		
		
	}

}
