package Condiciones;

import java.util.Scanner;

public class Condiciones17 
{
	public static void main(String[] Algo)
	{
		int dato;
		Scanner bote=new Scanner(System.in);
		System.out.println("Teclea un número entero menor al 5");
		dato=bote.nextInt();
		
		switch(dato)
		{
		case 0: System.out.println("Tecleaste un Cero"); break;
		case 1: System.out.println("Tecleaste un uno"); break;
		case 2: System.out.println("Tecleaste un dos"); break;
		case 3: System.out.println("Tecleaste un tres"); break;
		case 4: System.out.println("Tecleaste un cuatro"); break;
		default:
			System.out.println("Error");
		}
	}

}
