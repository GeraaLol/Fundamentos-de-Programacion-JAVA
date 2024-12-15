package Asd;
import java.util.Scanner;
public class Condiciones13 
{
	public static void main(String[] Algo)
	{
		Scanner bote=new Scanner(System.in);
		int a;
		
		System.out.println("Teclea tu edad");
		a=bote.nextInt();
		if (a>=18)
			System.out.println("Ya eres mayor de edad");
		else
			System.out.println("Eres menor de edad");
		}

}
