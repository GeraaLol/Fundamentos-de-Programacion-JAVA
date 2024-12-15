package Convertir;
import java.util.Scanner;
public class DollsaPesos 
{
	public static void main(String algo[])
	{
		Scanner bote=new Scanner(System.in);
		double peso,dollar;
		
		System.out.println("Teclea los dolares a convertir");
		dollar=bote.nextDouble();
		peso=dollar*20;
		System.out.println("Tus pesos son "+peso);
		
		
		
	}

	
	
}
