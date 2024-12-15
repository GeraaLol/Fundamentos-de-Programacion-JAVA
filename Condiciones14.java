package Asd;
import java.util.Scanner;
public class Condiciones14 
{
	public static void main(String[] Algo)
	{
		Scanner bote=new Scanner(System.in);
		int a,b;
		System.out.println("Teclea un número");
		a=bote.nextInt();
		b=(int)(Math.random()*10);
		
		if (a<=b)
			System.out.println("Ganaste");
		else
			System.out.println("Perdiste");		
	}

}
