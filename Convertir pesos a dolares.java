package Convertir;
import java.util.Scanner;
public class PesaDol 
{
	public static void main(String algo[])
	{
		Scanner bote=new Scanner(System.in);
		double peso,dolar,valorDolar;
		
		System.out.println("Teclea el valor del dolar de hoy");
		valorDolar=bote.nextDouble();
		System.out.println("Teclea tus pesos a convertir");
		peso=bote.nextDouble();
		dolar=valorDolar*peso;
		peso=bote.nextDouble();
		System.out.println("Tus dolares son "+peso);

	}

}
