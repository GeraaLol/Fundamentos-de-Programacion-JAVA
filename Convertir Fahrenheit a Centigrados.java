package Convertir;
import java.util.Scanner;
public class FaraCent 
{

	public static void main(String algo[])
	{
		Scanner bote=new Scanner(System.in);
		double far,cent;
		
		System.out.println("Teclea los grados fahrenheit");
		far=bote.nextDouble();
		cent=(far-32)/1.8;
		System.out.println("Resultado es "+cent+" grados C");
		
	}
}
