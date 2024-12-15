import java.util.Scanner;

public class Condiciones19 
{
	public static void main(String[] Algo) 
	{
		int opcion;
		System.out.println("    Menu \n1.-Mi nombre \n2.-Mi carrera \n3.Salida \nSelecciona una opcion...");
		Scanner bote=new Scanner(System.in);
		opcion=bote.nextInt();
		System.out.println(opcion);
		
		switch(opcion)
		{
		case 1:
			System.out.println("Mi nombre");
		break;
		case 2:
			System.out.println("Mi carrera");
		break;
		case 3:
			System.out.println("Salida");
		break;
		default:
			System.out.println("Tu opcion no existe");
			
		}
	}
}
