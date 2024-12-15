package Convertir;
import java.util.Scanner;
public class CaF 
{
	public static void main(String ElPepe[])
	{
		Scanner bote=new Scanner(System.in);
		double far,cent;
		
		System.out.println("Teclea los grados centigrados");
		cent=bote.nextDouble();
		far=cent*1.8+32;
		System.out.println("Resultado es "+far+" Grados F");
		
	}
	
}
